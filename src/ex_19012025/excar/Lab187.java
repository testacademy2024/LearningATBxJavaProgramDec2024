package ex_19012025.excar;

public class Lab187 {
    public static void main(String[] args) {
        Tesla t=new Tesla();
        t.openCar();
        t.start();
        t.partGearBox();

        t.speed();
        t.stop();

        WagonR wagonR=new WagonR();
        wagonR.openCar();
        wagonR.start();
        wagonR.partGearBox();

        wagonR.speed();
        wagonR.stop();
    }
}
