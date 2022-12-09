grammar Grammar;

start
    : main
    ;

main
    : function main | END_NOARG
    ;

function
    : functionNoArgument
    | functionIDArgument idArgument
    | functionNUMBERArgument numberArgument
    ;

functionNoArgument
    : SWAP_NOARG
    | COPY_NOARG
    | END_NOARG
    | GET_LABEL_CURR_CELL_NOARG
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
    | GET_LABEL_CELL_NUMBER
    ;

idArgument
    : ID
    ;

numberArgument
    : NUMBER
    ;

SWAP_NOARG
    : 'SWAP'
    ;

COPY_NOARG
    : 'COPY'
    ;

END_NOARG
    : 'END'
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

GET_LABEL_CURR_CELL_NOARG
    : 'GET_LABEL_CURR_CELL'
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

GET_LABEL_CELL_NUMBER
    : 'GET_LABEL_CELL'
    ;

NUMBER
    : '-'?('0'..'9')+
    ;

ID
    : [a-zA-Z]+('0'..'9')*
    ;

/* We're going to ignore all white space characters */
WS
    : [ \t\r\n]+ -> skip
    ;
