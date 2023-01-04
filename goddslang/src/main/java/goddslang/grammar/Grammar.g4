grammar Grammar;

start
    : preamble cells END_ALL_SUPER
    ;

preamble
    : cellsCount cellsGraph input
    ;

cellsCount
    : CELLS_COUNT_SUPER numberArgument
    ;

cellsGraph
    : CELLS_GRAPH_SUPER numberArgument
    ;

input
    : (inputVals inputCells)?
    ;

inputVals
    : INPUT_SUPER numberArgument+
    ;

inputCells
    : INPUT_CELLS_SUPER numberArgument+
    ;

cells
    : cell+
    ;

cell
    : cellHeader cellCode* END_SUPER
    ;

cellHeader
    : CELL_SUPER numberArgument idArgument
    ;

cellCode
    : cellCodePart+
    ;

cellCodePart
    : functionCall cellCodePart*
    | SRCCOPY_SUPER numberArgument cellCodePart*
    ;

functionCall
    : function arguments
    ;

arguments
    : (idArgument+ numberArgument*)*
    | (idArgument* numberArgument+)+
    |
    ;

functionSuper
    : CELLS_COUNT_SUPER
    | CELLS_GRAPH_SUPER
    | CELL_SUPER
    | END_SUPER
    | END_ALL_SUPER
    | SRCCOPY_SUPER
    | INPUT_SUPER
    | INPUT_CELLS_SUPER
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

INPUT_SUPER
    : '#INPUT'
    ;

INPUT_CELLS_SUPER
    : '#INPUT_CELLS'
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
