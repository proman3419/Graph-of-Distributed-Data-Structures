# Graph-of-Distributed-Data-Structures
[Documentation](docs/GoDDS.pdf)

[Code snippets](goddslang/src/main/resources/code%20snippets)

[Grammar](goddslang/src/main/java/goddslang/grammar/Grammar.g4)

### FizzBuzz implementation
```
#CELLS_COUNT 6
#CELLS_GRAPH
    011101
    010110
    001110
    100010
    000000
    100000
#END
#INPUT 100
#INPUT_CELLS 0
    #CELL 0 Counter
        READ_BUS
        //COPY
        SWAP

        LABEL main
            ADD 1
            //PRINTNL R0 0
            WRITE_CELL CheckFizz
            WRITE_CELL CheckBuzz
            SWAP
            WRITE_CELL AdditionalMemory
            READ_CELL Printer
            IFEZ print_number
            LABEL continue
                READ_CELL AdditionalMemory
                SWAP
                SUB R1
                IFEZ $
                ADD R1
                JUMP main

        LABEL print_number
            SWAP
            PRINTNL R0 0
            SWAP
            JUMP continue

        TERMINATE
    #END

    #CELL 1 CheckFizz %Daemon
        READ_CELL Counter

        JUMP Helpers@check_divisibility_by_three
        IFEZ set_true
        SET R0 0

        LABEL send_to_printer
            WRITE_CELL Printer

        JUMP ^

        LABEL set_true
            SET R0 2
            JUMP send_to_printer        
    #END

    #CELL 2 CheckBuzz %Daemon
        READ_CELL Counter

        JUMP Helpers@check_divisibility_by_five
        IFEZ set_true
        SET R0 0

        LABEL send_to_printer
            WRITE_CELL Printer

        JUMP ^

        LABEL set_true
            SET R0 1
            JUMP send_to_printer        
    #END

    #CELL 3 Printer %Daemon
        READ_CELL CheckFizz
        SWAP
        READ_CELL CheckBuzz
        ADD R1

        SUB 3
        IFEZ Helpers@print_fizz
        IFEZ Helpers@print_buzz
        IFEZ Helpers@print_newline
        ADD 3

        SUB 2
        IFEZ Helpers@print_fizz
        IFEZ Helpers@print_newline
        ADD 2

        SUB 1
        IFEZ Helpers@print_buzz
        IFEZ Helpers@print_newline
        ADD 1

        WRITE_CELL Counter // call print_number if needed
        JUMP ^
    #END

    #CELL 4 Helpers %Inactive
        // this cell is just a labels holder

        LABEL check_divisibility_by_three
            MOD 3
            IFEZ set_true
            EXIT

        LABEL check_divisibility_by_five
            MOD 5
            IFEZ set_true
            EXIT

        LABEL set_true
            SET R0 0
            EXIT

        LABEL set_false
            SET R0 -1
            EXIT

        LABEL print_fizz
            PRINT Fizz 0
            EXIT

        LABEL print_buzz
            PRINT Buzz 0
            EXIT

        LABEL print_newline
            PRINTNL 0
    #END

    #CELL 5 AdditionalMemory %Daemon
        READ_CELL Counter
        WRITE_CELL Counter
        JUMP ^
    #END
#END_ALL
```
