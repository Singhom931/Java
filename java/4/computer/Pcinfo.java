package computer;

public class Pcinfo {
    public static void main(String[] args) {
    Monitor monitor = new Monitor();
    Cpu cpu = new Cpu();
    Speaker speaker = new Speaker();
    Keyboard keyboard = new Keyboard();
    //Pc pc = new Pc();
    monitor.info();monitor.about();
    cpu.info();cpu.about();
    speaker.info();speaker.about();
    keyboard.info();keyboard.about();
    }
}
