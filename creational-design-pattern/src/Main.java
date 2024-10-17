import abstractfactorydesignpattern.Client;
import abstractfactorydesignpattern.implimentaions.factoryimplimentations.ModernFurnitureFactory;
import abstractfactorydesignpattern.implimentaions.factoryimplimentations.VictorianFurnitureFactory;
import abstractfactorydesignpattern.interfaces.factory.FurnitureFactory;
import singletondesignpattern.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Singleton sig = Singleton.getLibrary();
        System.out.println(sig.print());

   //  calling factory pattern design
      // for modern user
        FurnitureFactory modernfurnitureFactory = new ModernFurnitureFactory();
        Client modernclient = new Client(modernfurnitureFactory);
        modernclient.useFurniture();

        System.out.println( );
        // for victorian user
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
        Client victorianclient = new Client(victorianFurnitureFactory);
        victorianclient.useFurniture();





    }
}