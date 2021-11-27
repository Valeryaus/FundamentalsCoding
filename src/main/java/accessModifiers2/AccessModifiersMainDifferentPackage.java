package accessModifiers2;

import accessModifiers.AccessModifiersMain;

public class AccessModifiersMainDifferentPackage {

    public static void main(String[] args) {
        //AccessModifiersMain.sayHelloUsingDefault(); // negaliu pasiekti package-private metodo kitame package
        AccessModifiersMain.sayHelloUsingPublic(); // pasiektas iš kitos klases ir kito package'o. nes nustatytas public access modifier.\
        //AccessModifiersMain.sayHelloUsingProtected(); // negaliu pasiekti kito package'o PROTECTED metodu.
        //AccessModifiersMain.sayHelloUsingPrivate(); // negaliu pasiekti kitu klasiu PRIVATE metodu.
    }
}
