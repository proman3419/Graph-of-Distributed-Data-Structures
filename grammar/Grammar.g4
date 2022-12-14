grammar Grammar;

start
    : preamble cellsCode
    ;

preamble
    : CELLS_COUNT_SUPER numberArgument CELLS_GRAPH_SUPER numberArgument END_SUPER
    ;

cellsCode
    : CELL_SUPER numberArgument idArgument cellCodePart cellsCode
    | END_ALL_SUPER
    ;

cellCodePart
    : function cellCodePart
    | END_SUPER
    ;

function
    : functionNoArgument
    | functionIDArgument idArgument
    | functionNUMBERArgument numberArgument
    ;

functionSuper
    : CELLS_COUNT_SUPER
    | CELLS_GRAPH_SUPER
    | CELL_SUPER
    | END_SUPER
    ;

functionNoArgument
    : SWAP_NOARG
    | COPY_NOARG
    | PRINT_NOARG
    ;

functionIDArgument
    : DEFINE_LABEL_ID
    | JUMP_ID
    | CHECK_IFEZ_ID
    | CHECK_IFLZ_ID
    | CHECK_IFGZ_ID
    | WRITE_CELL_ID
    | READ_CELL_ID
    | COPY_CELL_ID
    | SRCCOPY_CELL_ID
    ;

functionNUMBERArgument
    : ADD_NUMBER
    | SUB_NUMBER
    | MUL_NUMBER
    | DIV_NUMBER
    | MOD_NUMBER
    | COMP_NUMBER
    | PRINT_LABEL_NAME_NUMBER
    ;

idArgument
    : ID
    ;

numberArgument
    : NUMBER
    ;

//multilineNumberArgument
//    : MULTILINE_NUMBER
//    ;

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

SWAP_NOARG
    : 'SWAP'
    ;

COPY_NOARG
    : 'COPY'
    ;

DEFINE_LABEL_ID
    : 'LABEL' 
    ;

JUMP_ID
    : 'JUMP'
    ;

CHECK_IFEZ_ID
    : 'IFEZ'
    ;

CHECK_IFLZ_ID
    : 'IFLZ'
    ;

CHECK_IFGZ_ID
    : 'IFGZ'
    ;

WRITE_CELL_ID
    : 'WRITE_CELL'
    ;

READ_CELL_ID
    : 'READ_CELL'
    ;

COPY_CELL_ID
    : 'COPY_CELL'
    ;

SRCCOPY_CELL_ID
    : 'SRCCOPY_CELL'
    ;    

PRINT_NOARG
    : 'PRINT'
    ;

PRINT_LABEL_NAME_NUMBER
    : 'PRINT_LABEL_NAME'
    ;

PRINT_LABEL_ID_NUMBER
    : 'PRINT_LABEL_ID'
    ;

ADD_NUMBER
    : 'ADD'
    ;

SUB_NUMBER
    : 'SUB'
    ;

MUL_NUMBER
    : 'MUL'
    ;

DIV_NUMBER
    : 'DIV'
    ;

MOD_NUMBER
    : 'MOD'
    ;

COMP_NUMBER
    : 'COMP'
    ;

NUMBER
    : '-'?('0'..'9')+
    ;

//MULTILINE_NUMBER
//    : ('0'..'9'[\n])+
//    ;

ID
    : [a-zA-Z]+('0'..'9')*
    ;


/* We're going to ignore all white space characters */
WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
  : '//' ~( '\r' | '\n' )* -> skip
  ;
