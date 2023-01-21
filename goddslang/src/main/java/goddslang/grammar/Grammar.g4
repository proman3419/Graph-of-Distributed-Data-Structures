grammar Grammar;

start
    : preamble cells SUPER_END_ALL
    ;

preamble
    : cellsCount cellsGraph input
    ;

cellsCount
    : SUPER_CELLS_COUNT numberArgument
    ;

cellsGraph
    : SUPER_CELLS_GRAPH numberArgument+ SUPER_END
    ;

input
    : (inputVals inputCells)?
    ;

inputVals
    : SUPER_INPUT numberArgument+
    ;

inputCells
    : SUPER_INPUT_CELLS numberArgument+
    ;

cells
    : cell+
    ;

cell
    : cellHeader cellCode? SUPER_END
    ;

cellHeader
    : SUPER_CELL numberArgument idArgument
    ;

cellCode
    : cellCodePart+
    ;

cellCodePart
    : functionCall cellCodePart*
    ;

arguments
    : (idArgument+ numberArgument*)*
    | (idArgument* numberArgument+)+
    |
    ;

extendedLabel
    : ID('$'(ID|'@'))*
    ;

functionCall
    : functionAdd
    | functionSub
    | functionMul
    | functionDiv
    | functionMod
    | functionSet
    | functionComp
    | functionSwap
    | functionCopy
    | functionDefineLabel
    | functionJump
    | functionCheckIFEZ
    | functionCheckIFLZ
    | functionCheckIFGZ
    | functionExit
    | functionPrint
    | functionPrintChar
    | functionWriteCell
    | functionReadCell
    | functionCopyCell
    | functionPrintLabelName
    ;

functionAdd
    : ADD arguments
    ;

functionSub
    : SUB arguments
    ;

functionMul
    : MUL arguments
    ;

functionDiv
    : DIV arguments
    ;

functionMod
    : MOD arguments
    ;

functionSet
    : SET arguments
    ;

functionComp
    : COMP arguments
    ;

functionSwap
    : SWAP arguments
    ;

functionCopy
    : COPY arguments
    ;

functionDefineLabel
    : DEFINE_LABEL arguments
    ;

functionJump
    : JUMP extendedLabel
    ;

functionCheckIFEZ
    : CHECK_IFEZ arguments
    ;

functionCheckIFLZ
    : CHECK_IFLZ arguments
    ;

functionCheckIFGZ
    : CHECK_IFGZ arguments
    ;

functionExit
    : EXIT arguments
    ;

functionPrint
    : PRINT arguments
    ;

functionPrintChar
    : PRINT_CHAR arguments
    ;

functionWriteCell
    : WRITE_CELL arguments
    ;

functionReadCell
    : READ_CELL arguments
    ;

functionCopyCell
    : COPY_CELL arguments
    ;

functionPrintLabelName
    : PRINT_LABEL_NAME arguments
    ;

SUPER_CELLS_COUNT
    : '#CELLS_COUNT'
    ;

SUPER_CELLS_GRAPH
    : '#CELLS_GRAPH'
    ;

SUPER_INPUT
    : '#INPUT'
    ;

SUPER_INPUT_CELLS
    : '#INPUT_CELLS'
    ;

SUPER_CELL
    : '#CELL'
    ;

SUPER_END
    : '#END'
    ;

SUPER_END_ALL
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
    : [a-zA-Z_-]+('0'..'9')*
    ;

// Ignore white space characters
WS
    : [ \t\r\n]+ -> skip
    ;

// Comment starts with '//'
COMMENT
  : '//' ~( '\r' | '\n' )* -> skip
  ;
