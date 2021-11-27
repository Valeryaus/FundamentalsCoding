package accessModifiers;

public class AccessModifiersSamePackage {
    public static void main(String[] args) {
        AccessModifiersMain.sayHelloUsingDefault(); // pasiektas per package-private modifier. Nes tas pats package.
        AccessModifiersMain.sayHelloUsingPublic(); // pasiektas per public modifier.
        //AccessModifiersMain.sayHelloUsingPrivate(); // negalima pasiekti is kitos klases PRIVATE modifier metodo.
        AccessModifiersMain.sayHelloUsingProtected(); // galima pasiekti Protekted modifier, nes tame paciame package.

    }
}