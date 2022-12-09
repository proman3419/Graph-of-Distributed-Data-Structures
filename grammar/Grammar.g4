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
    : ADD_VAL
    | SUB_VAL
    | MUL_VAL
    | DIV_VAL
    | MOD_VAL
    | COMP_VAL
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
    : 'WRITE'
    ;

READ_CELL_ID
    : 'READ'
    ;

COPY_CELL_ID
    : 'COPY'
    ;

SRCCOPY_CELL_ID
    : 'SRCCOPY'
    ;    

ADD_VAL
    : 'ADD'
    ;

SUB_VAL
    : 'SUB'
    ;

MUL_VAL
    : 'MUL'
    ;

DIV_VAL
    : 'DIV'
    ;

MOD_VAL
    : 'MOD'
    ;

COMP_VAL
    : 'COMP'
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
