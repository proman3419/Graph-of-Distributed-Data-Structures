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

functionCall
    : functionAdd
    | functionSub
    | functionMul
    | functionDiv
    | functionMod
    | functionAbs
    | functionSet
    | functionComp
    | functionSwap
    | functionCopy
    | functionDefineLabel
    | functionJump
    | functionCheckIFEZ
    | functionCheckIFNZ
    | functionCheckIFLZ
    | functionCheckIFGZ
    | functionExit
    | functionPrint
    | functionPrintNL
    | functionPrintChar
    | functionPrintNLChar
    | functionWriteCell
    | functionReadCell
    | functionReadBus
    | functionCopyCell
    | functionPrintLabelName
    | functionPass
    | functionTerminate
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

functionAbs
    : ABS
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
    : JUMP extendedDefinedLabel
    ;

functionCheckIFEZ
    : CHECK_IFEZ extendedDefinedLabel
    ;

functionCheckIFNZ
    : CHECK_IFNZ extendedDefinedLabel
    ;

functionCheckIFLZ
    : CHECK_IFLZ extendedDefinedLabel
    ;

functionCheckIFGZ
    : CHECK_IFGZ extendedDefinedLabel
    ;

functionExit
    : EXIT arguments
    ;

functionPrint
    : PRINT arguments
    ;

functionPrintNL
    : PRINTNL arguments
    ;

functionPrintChar
    : PRINT_CHAR arguments
    ;

functionPrintNLChar
    : PRINTNL_CHAR arguments
    ;

functionWriteCell
    : WRITE_CELL arguments
    ;

functionReadCell
    : READ_CELL arguments
    ;

functionReadBus
    : READ_BUS arguments
    ;

functionCopyCell
    : COPY_CELL arguments
    ;

functionPrintLabelName
    : PRINT_LABEL_NAME arguments
    ;

functionPass
    : PASS arguments
    ;

functionTerminate
    : TERMINATE arguments
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

ABS
    : 'ABS'
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

CHECK_IFNZ
    : 'IFNZ'
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

PRINTNL
    : 'PRINTNL'
    ;

PRINT_CHAR
    : 'PRINT_CHAR'
    ;

PRINTNL_CHAR
    : 'PRINTNL_CHAR'
    ;

WRITE_CELL
    : 'WRITE_CELL'
    ;

READ_CELL
    : 'READ_CELL'
    ;

READ_BUS
    : 'READ_BUS'
    ;

COPY_CELL
    : 'COPY_CELL'
    ;

PRINT_LABEL_NAME
    : 'PRINT_LABEL_NAME'
    ;

PASS
    : 'PASS'
    ;

TERMINATE
    : 'TERMINATE'
    ;

idArgument
    : ID
    ;

numberArgument
    : NUMBER
    ;


extendedDefinedLabel
    : definedLabel
    | ID'@'definedLabel
    ;

 definedLabel
    : '^'
    | '$'
    | ID
    ;

NUMBER
    : '-'?('0'..'9')+
    ;

ID
    : ('_'|'-'|[a-zA-Z])+('0'..'9')*
    ;



// Ignore white space characters
WS
    : [ \t\r\n]+ -> skip
    ;

// Comment starts with '//'
COMMENT
  : '//' ~( '\r' | '\n' )* -> skip
  ;
