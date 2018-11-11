import java.util.*;
import java.lang.*;

public class Chip8 {

    private int currentOpcode;
    private List<Byte> memory;
    private List<Byte> register;
    private short indexRegister;
    private short programCounter;

    private List<Byte> screen;

    private byte delayTimer;
    private byte soundTimer;

    private List<Short> programStack;
    private short stackPointer;

    private List<Byte> keypad;

    public Chip8(){
        currentOpcode = 0;
        memory = Arrays.asList(new Byte[4096]);
        register = Arrays.asList(new Byte[16]);

        indexRegister = 0;
        programCounter = 0;

        screen = Arrays.asList(new Byte[64*32]);

        delayTimer = 0;
        soundTimer = 0;

        programStack = Arrays.asList(new Short[16]);
        stackPointer = 0;

        keypad = Arrays.asList(new Byte[16]);

    }

    public void initialize() {
        programCounter = 0x200;
        currentOpcode = 0;
        indexRegister = 0;
        stackPointer = 0;

        //clear display, stack, registers, memory
        screen.clear();
        programStack.clear();
        register.clear();
        memory.clear();

        //load font_set
//        int FONTSET_CHARACTERS = 80;
//        for(int i = 0; i < FONTSET_CHARACTERS; ++i){
//            memory.set(i,chip8_fontset[i]);
//        }

        delayTimer = 0;
        soundTimer = 0;
    }

    public void emulateCycle(){
        currentOpcode = memory.get(programCounter) << 8 | memory.get(programCounter +1);
        //TODO: decode opcode
        //TODO: execude opcode

        //TODO: update timers
    }

}

