import pattern.creational.abstractfactory.factories.GuiFactory;
import pattern.creational.abstractfactory.products.OsType;
import pattern.creational.factorymethod.creator.DealerPurbalingga;
import pattern.creational.factorymethod.creator.DealerYogyakarta;
import pattern.creational.factorymethod.product.Motorcycle;
import pattern.creational.factorymethod.product.MotorcycleType;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("==============================================================");
        System.out.println("============= Factory Method (Creational Pattern)=============");
        System.out.println("==============================================================");

        DealerYogyakarta dealerYogyakarta = new DealerYogyakarta();
        DealerPurbalingga dealerPurbalingga = new DealerPurbalingga();

        Motorcycle motorcycleVixion = dealerYogyakarta.orderMotorcycle(MotorcycleType.VIXION);
        motorcycleVixion.prepare();
        motorcycleVixion.acceleration();
        motorcycleVixion.speed();
        motorcycleVixion.balance();

        Motorcycle motorcycleShogun = dealerYogyakarta.orderMotorcycle(MotorcycleType.SHOGUN);
        motorcycleShogun.prepare();
        motorcycleShogun.acceleration();
        motorcycleShogun.speed();
        motorcycleShogun.balance();

        Motorcycle motorcycleVario = dealerPurbalingga.orderMotorcycle(MotorcycleType.VARIO);
        motorcycleVario.prepare();
        motorcycleVario.acceleration();
        motorcycleVario.speed();
        motorcycleVario.balance();

        System.out.println("==============================================================");
        System.out.println("=================== End Of Factory Method ====================");
        System.out.println("==============================================================");
        System.out.println();
        System.out.println();

        System.out.println("==============================================================");
        System.out.println("============ Abstract Factory (Creational Pattern)============");
        System.out.println("==============================================================");

        GuiFactory linuxFactory = GuiFactory.getFactory(OsType.LINUX);
        GuiFactory windowsFactory = GuiFactory.getFactory(OsType.WINDOWS);

        linuxFactory.createButton().paint();
        linuxFactory.createCheckbox().paint();
        windowsFactory.createButton().paint();
        windowsFactory.createCheckbox().paint();

        System.out.println("==============================================================");
        System.out.println("================== End Of Abstract Factory ===================");
        System.out.println("==============================================================");
        System.out.println();
        System.out.println();
    }
}
