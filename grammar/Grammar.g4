grammar Grammar;

start
    : preamble cellsCode
    ;

preamble
    : CELLS_COUNT_SUPER numberArgument
        CELLS_GRAPH_SUPER numberArgument
        (INPUT_VALS_SUPER ID NUMBER+ INPUT_VALS_ORDER_SUPER NUMBER+)*
        (SET_ALL_SUPER ID NUMBER+)*
    ;

cellsCode
    : CELL_SUPER numberArgument idArgument cellCodePart cellsCode
    | END_ALL_SUPER
    ;

cellCodePart
    : functionCall cellCodePart
    | SRCCOPY_SUPER numberArgument cellCodePart
    | END_SUPER
    ;

functionCall
    : function (idArgument+ numberArgument*)*
    | function (idArgument* numberArgument+)+
    | function
    ;

functionSuper
    : CELLS_COUNT_SUPER
    | CELLS_GRAPH_SUPER
    | CELL_SUPER
    | END_SUPER
    | END_ALL_SUPER
    | SRCCOPY_SUPER
    | SET_ALL_SUPER
    | INPUT_VALS_SUPER
    | INPUT_VALS_ORDER_SUPER
    ;

function
    // v NOARG v
    : SWAP
    | COPY
    | PRINT
    | PRINT_CHAR
    // ^ NOARG ^
    // v ID v
    | DEFINE_LABEL
    | JUMP
    | CHECK_IFEZ
    | CHECK_IFLZ
    | CHECK_IFGZ
    // ^ ID ^
    // v NUMBER v
    | WRITE_CELL
    | READ_CELL
    | COPY_CELL
    | ADD
    | SUB
    | MUL
    | DIV
    | MOD
    | COMP
    | PRINT_LABEL_NAME
    // ^ NUMBER ^
    | SET
    ;

idArgument
    : ID
    ;

numberArgument
    : NUMBER
    ;

CELLS_COUNT_SUPER
    : '#CELLS_COUNT'
    ;

CELLS_GRAPH_SUPER
    : '#CELLS_GRAPH'
    ;

CELL_SUPER
    : '#CELL'
    ;

END_SUPER
    : '#END'
    ;

END_ALL_SUPER
    : '#END_ALL'
    ;

INPUT_VALS_SUPER
    : '#INPUT_VALS'
    ;

INPUT_VALS_ORDER_SUPER
    : '#INPUT_VALS_ORDER'
    ;

SWAP
    : 'SWAP'
    ;

COPY
    : 'COPY'
    ;

DEFINE_LABEL
    : 'LABEL' 
    ;

JUMP
    : 'JUMP'
    ;

CHECK_IFEZ
    : 'IFEZ'
    ;

CHECK_IFLZ
    : 'IFLZ'
    ;

CHECK_IFGZ
    : 'IFGZ'
    ;

WRITE_CELL
    : 'WRITE_CELL'
    ;

READ_CELL
    : 'READ_CELL'
    ;

COPY_CELL
    : 'COPY_CELL'
    ;

SRCCOPY_SUPER
    : '#SRCCOPY'
    ;    

PRINT
    : 'PRINT'
    ;

PRINT_CHAR
    : 'PRINT_CHAR'
    ;

PRINT_LABEL_NAME
    : 'PRINT_LABEL_NAME'
    ;

PRINT_LABEL_ID
    : 'PRINT_LABEL_ID'
    ;

ADD
    : 'ADD'
    ;

SUB
    : 'SUB'
    ;

MUL
    : 'MUL'
    ;

DIV
    : 'DIV'
    ;

MOD
    : 'MOD'
    ;

COMP
    : 'COMP'
    ;

SET
    : 'SET'
    ;

SET_ALL_SUPER
    : '#SET_ALL'
    ;

NUMBER
    : '-'?('0'..'9')+
    ;

ID
    : [a-zA-Z]+('0'..'9')*
    ;

// Ignore white space characters
WS
    : [ \t\r\n]+ -> skip
    ;

// Comment starts with '//'
COMMENT
  : '//' ~( '\r' | '\n' )* -> skip
  ;
