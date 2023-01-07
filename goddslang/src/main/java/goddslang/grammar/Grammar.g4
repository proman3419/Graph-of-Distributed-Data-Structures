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
    : CELLS_GRAPH_SUPER numberArgument+ END_SUPER
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
    : cellHeader cellCode? END_SUPER
    ;

cellHeader
    : CELL_SUPER numberArgument idArgument
    ;

cellCode
    : cellCodePart+
    ;

cellCodePart
    : functionCall cellCodePart*
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
    | INPUT_SUPER
    | INPUT_CELLS_SUPER
    | CELL_SUPER
    | END_SUPER
    | END_ALL_SUPER
    ;

function
    : FUNCTION_ADD
    | FUNCTION_SUB
    | FUNCTION_MUL
    | FUNCTION_DIV
    | FUNCTION_MOD
    | FUNCTION_SET
    | FUNCTION_COMP
    | FUNCTION_SWAP
    | FUNCTION_COPY
    | FUNCTION_DEFINE_LABEL
    | FUNCTION_JUMP
    | FUNCTION_CHECK_IFEZ
    | FUNCTION_CHECK_IFLZ
    | FUNCTION_CHECK_IFGZ
    | FUNCTION_EXIT
    | FUNCTION_PRINT
    | FUNCTION_PRINT_CHAR
    | FUNCTION_WRITE_CELL
    | FUNCTION_READ_CELL
    | FUNCTION_COPY_CELL
    | FUNCTION_PRINT_LABEL_NAME
    ;

FUNCTION_ADD
    : ADD
    ;

FUNCTION_SUB
    : SUB
    ;

FUNCTION_MUL
    : MUL
    ;

FUNCTION_DIV
    : DIV
    ;

FUNCTION_MOD
    : MOD
    ;

FUNCTION_SET
    : SET
    ;

FUNCTION_COMP
    : COMP
    ;

FUNCTION_SWAP
    : SWAP
    ;

FUNCTION_COPY
    : COPY
    ;

FUNCTION_DEFINE_LABEL
    : DEFINE_LABEL
    ;

FUNCTION_JUMP
    : JUMP
    ;

FUNCTION_CHECK_IFEZ
    : CHECK_IFEZ
    ;

FUNCTION_CHECK_IFLZ
    : CHECK_IFLZ
    ;

FUNCTION_CHECK_IFGZ
    : CHECK_IFGZ
    ;

FUNCTION_EXIT
    : EXIT
    ;

FUNCTION_PRINT
    : PRINT
    ;

FUNCTION_PRINT_CHAR
    : PRINT_CHAR
    ;

FUNCTION_WRITE_CELL
    : WRITE_CELL
    ;

FUNCTION_READ_CELL
    : READ_CELL
    ;

FUNCTION_COPY_CELL
    : COPY_CELL
    ;

FUNCTION_PRINT_LABEL_NAME
    : PRINT_LABEL_NAME
    ;

CELLS_COUNT_SUPER
    : '#CELLS_COUNT'
    ;

CELLS_GRAPH_SUPER
    : '#CELLS_GRAPH'
    ;

INPUT_SUPER
    : '#INPUT'
    ;

INPUT_CELLS_SUPER
    : '#INPUT_CELLS'
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

SET
    : 'SET'
    ;

COMP
    : 'COMP'
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

EXIT
    : 'EXIT'
    ;

PRINT
    : 'PRINT'
    ;

PRINT_CHAR
    : 'PRINT_CHAR'
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

PRINT_LABEL_NAME
    : 'PRINT_LABEL_NAME'
    ;

idArgument
    : ID
    ;

numberArgument
    : NUMBER
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
