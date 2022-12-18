package day34_Statics_GarbageCollection_AccessModifier.StaticImport;

/*
regular import: imports EVERYTHING from the class
			    import packageName.className;
			    import packageName.*;

static import:
                import static packageName.className.staticMember; --> one static member of a class
			    import static packageName.className.*;			  --> imports all static members of a class
 */


//If we are to use only staticMembers of a class, no need to import everything cuz of memory usage
//If it is a staticMember, by staticImport we can call that member only
//plus, after calling --> there is no need to call that member through its class name
//it can be called directly by its own name
//this is importing only pi
import static day34_Statics_GarbageCollection_AccessModifier.StaticBlock.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {

        System.out.println(pi);


    }


}
