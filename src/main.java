
class Chip8Emulator {
    public static void main(){
        Chip8 machine = new Chip8();

        //setup Graphics and Inputs

        machine.initialize();
        //TODO: open file and load buffer
//        for(int i =0; i < bufferSize; ++i){
//            memory.set(i + 512, buffer[i]);
//        }

        //Emulation Loop
        boolean continueEmulation = true;
        while(continueEmulation){

            machine.emulateCycle();
            //TODO: update screen
            //TODO: capture input
        }


    }
}
