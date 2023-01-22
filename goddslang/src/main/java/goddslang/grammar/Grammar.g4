grammar Grammar;

// Preamble ============================================================================================================
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

// Cell ================================================================================================================
cell
    : cellHeader cellCode? SUPER_END
    ;

cellHeader
    : SUPER_CELL numberArgument idArgument cellOptions
    ;

cellOptions
    : cellOption*
    ;

cellOption
    : CELL_OPTION_DAEMON
    | CELL_OPTION_INACTIVE
    ;

cellCode
    : cellCodePart+
    ;

cellCodePart
    : functionCall cellCodePart*
    ;

CELL_OPTION_DAEMON
    : '%Daemon'
    ;

CELL_OPTION_INACTIVE
    : '%Inactive'
    ;

// Functions ===========================================================================================================
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
    : ADD (numberArgument | idArgument)
    ;

functionSub
    : SUB (numberArgument | idArgument)
    ;

functionMul
    : MUL (numberArgument | idArgument)
    ;

functionDiv
    : DIV (numberArgument | idArgument)
    ;

functionMod
    : MOD (numberArgument | idArgument)
    ;

functionAbs
    : ABS
    ;

functionSet
    : SET idArgument numberArgument
    ;

functionComp
    : COMP numberArgument
    ;

functionSwap
    : SWAP
    ;

functionCopy
    : COPY
    ;

functionDefineLabel
    : DEFINE_LABEL idArgument
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
    : EXIT
    ;

functionPrint
    : PRINT printArguments
    ;

functionPrintNL
    : PRINTNL printArguments
    ;

functionPrintChar
    : PRINT_CHAR printArguments
    ;

functionPrintNLChar
    : PRINTNL_CHAR printArguments
    ;

functionWriteCell
    : WRITE_CELL idArgument
    ;

functionReadCell
    : READ_CELL idArgument
    ;

functionReadBus
    : READ_BUS
    ;

functionCopyCell
    : COPY_CELL idArgument
    ;

functionPrintLabelName
    : PRINT_LABEL_NAME numberArgument
    ;

functionPass
    : PASS numberArgument
    ;

functionTerminate
    : TERMINATE
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

// Arguments ===========================================================================================================
arguments
    : (idArgument+ numberArgument*)*
    | (idArgument* numberArgument+)+
    |
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

printArguments
    : arguments numberArgument
    | numberArgument
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
