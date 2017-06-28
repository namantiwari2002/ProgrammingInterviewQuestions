package namantiwari.programminginterviewquestions;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hello extends AppCompatActivity {

    public final static String SITE1_KEY = "site1.site1_key";
    public final static String SITE2_KEY = "site2.site2_key";
    Button cssa,css3,htmla,html5,jsa,jqa,mysqla,phpa,javaa,ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

            javaa = (Button)findViewById(R.id.java);
            ca = (Button)findViewById(R.id.c);

        htmla = (Button)findViewById(R.id.html);
        html5 = (Button)findViewById(R.id.html_five);
        jsa = (Button)findViewById(R.id.js);
        jqa = (Button)findViewById(R.id.jq);
        mysqla = (Button)findViewById(R.id.mysql);
        phpa = (Button)findViewById(R.id.php);
        cssa = (Button)findViewById(R.id.css);

            ca.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            Toast.makeText(getBaseContext(), "Processing", Toast.LENGTH_SHORT).show();

                            String site1 = "\n" +
                                    "More from this lessonC++ BasicsC++ Advanced\n" +
                                    "Technical Interview PrepTechnical Interview- IntroductionC Interview QuestionsC++ Interview Questions | FreeC# Interview QuestionsDBMS Interview QuestionsOS Interview QuestionsJava Interview Questions.Net Interview QuestionsPHP Interview QuestionsNetworking Interview QuestionsSoftware Testing Interview QuestionsData Structure Interview QuestionsAlgorithms Interview QuestionsElectrical Interview QuestionsElectronics Interview QuestionsMechanical Interview QuestionsCivilAndroid Interview Questions\n" +
                                    "C++ Interview Questions\n" +
                                    "\n" +
                                    "Share Share this on Facebook Share on Google+ Share on Linked IN Share on Google+ 95947 views, 233 found it useful\n" +
                                    "Poor\n" +
                                    "Okay\n" +
                                    "Good\n" +
                                    "Great\n" +
                                    "Awesome\n" +
                                    "Learn and practice Technical Interview Prep, Interview Preparation, C++ Interview Questions | Free questions and answers with explanation for interview,placement test,online test,competitive examination and entrance test\n" +
                                    "1.  What is C++?\n" +
                                    "Released in 1985, C++ is an object-oriented programming language created by Bjarne Stroustrup. C++ maintains almost all aspects of the C language, while simplifying memory management and adding several features - including a new datatype known as a class (you will learn more about these later) - to allow object-oriented programming. C++ maintains the features of C which allowed for low-level memory access but also gives the programmer new tools to simplify memory management. \n" +
                                    "C++ used for:\n" +
                                    "C++ is a powerful general-purpose programming language. It can be used to create small programs or large applications. It can be used to make CGI scripts or console-only DOS programs. C++ allows you to create programs to do almost anything you need to do. The creator of C++, Bjarne Stroustrup, has put together a partial list of applications written in C++.\n" +
                                    " \n" +
                                    "2. How do you find out if a linked-list has an end? (i.e. the list is not a cycle) \n" +
                                    "You can find out by using 2 pointers. One of them goes 2 nodes each time. The second one goes at 1 nodes each time. If there is a cycle, the one that goes 2 nodes each time will eventually meet the one that goes slower. If that is the case, then you will know the linked-list is a cycle.\n" +
                                    " \n" +
                                    "3. What is the difference between realloc() and free()? \n" +
                                    "The free subroutine frees a block of memory previously allocated by the malloc subroutine. Undefined results occur if the Pointer parameter is not a valid pointer. If the Pointer parameter is a null value, no action will occur. The realloc subroutine changes the size of the block of memory pointed to by the Pointer parameter to the number of bytes specified by the Size parameter and returns a new pointer to the block. The pointer specified by the Pointer parameter must have been created with the malloc, calloc, or realloc subroutines and not been deallocated with the free or realloc subroutines. Undefined results occur if the Pointer parameter is not a valid pointer.\n" +
                                    " \n" +
                                    "4.  Base class has some virtual method and derived class has a method with the same name. If we initialize the base class pointer with derived object, calling of that virtual method will result in which method being called? \n" +
                                    "a. Base method \n" +
                                    "b. Derived method\n" +
                                    "Ans. B\n" +
                                    " \n" +
                                    "5. What is function overloading and operator overloading?\n" +
                                    "Function overloading: C++ enables several functions of the same name to be defined, as long as these functions have different sets of parameters (at least as far as their types are concerned). This capability is called function overloading. When an overloaded function is called, the C++ compiler selects the proper function by examining the number, types and order of the arguments in the call. Function overloading is commonly used to create several functions of the same name that perform similar tasks but on different data types.\n" +
                                    "\n" +
                                    "Operator overloading allows existing C++ operators to be redefined so that they work on objects of user-defined classes. Overloaded operators are syntactic sugar for equivalent function calls. They form a pleasant facade that doesn't add anything fundamental to the language (but they can improve understandability and reduce maintenance costs).\n" +
                                    "6.  What are the advantages of inheritance? \n" +
                                    "It permits code reusability. Reusability saves time in program development. It encourages the reuse of proven and debugged high-quality software, thus reducing problem after a system becomes functional.\n" +
                                    " \n" +
                                    "7.What is the difference between declaration and definition? \n" +
                                    "The declaration tells the compiler that at some later point we plan to present the definition of this declaration.\n" +
                                    "E.g.: void stars () //function declaration \n" +
                                    "The definition contains the actual implementation.\n" +
                                    "E.g.: void stars () // declarator\n" +
                                    "{\n" +
                                    "for(int j=10; j > =0; j--) //function body\n" +
                                    "cout << *;\n" +
                                    "cout << endl; \n" +
                                    "}\n" +
                                    " \n" +
                                    "8.  How do you write a function that can reverse a linked-list?\n" +
                                    "void reverselist(void)\n" +
                                    "{\n" +
                                    "if(head==0)\n" +
                                    "return;\n" +
                                    "if(head->next==0)\n" +
                                    "return;\n" +
                                    "if(head->next==tail)\n" +
                                    "{\n" +
                                    "head->next = 0;\n" +
                                    "tail->next = head;\n" +
                                    "}\n" +
                                    "else\n" +
                                    "{\n" +
                                    "node* pre = head;\n" +
                                    "node* cur = head->next;\n" +
                                    "node* curnext = cur->next;\n" +
                                    "head->next = 0;\n" +
                                    "cur-> next = head;\n" +
                                    "for(; curnext!=0; )\n" +
                                    "{\n" +
                                    "cur->next = pre;\n" +
                                    "pre = cur;\n" +
                                    "cur = curnext;\n" +
                                    "curnext = curnext->next;\n" +
                                    "}\n" +
                                    "curnext->next = cur;\n" +
                                    "}\n" +
                                    "}\n" +
                                    "9.  What do you mean by inline function?\n" +
                                    "The idea behind inline functions is to insert the code of a called function at the point where the function is called. If done carefully, this can improve the application's performance in exchange for increased compile time and possibly (but not always) an increase in the size of the generated binary executables.\n" +
                                    " \n" +
                                    "10. Write a program that ask for user input from 5 to 9 then calculate the average\n" +
                                    "#include \"iostream.h\"\n" +
                                    "int main() {\n" +
                                    "int MAX = 4;\n" +
                                    "int total = 0;\n" +
                                    "int average;\n" +
                                    "int numb;\n" +
                                    "for (int i=0; i<MAX; i++) {\n" +
                                    "cout << \"Please enter your input between 5 and 9: \";\n" +
                                    "cin >> numb;\n" +
                                    "while ( numb<5 || numb>9) {\n" +
                                    "cout << \"Invalid input, please re-enter: \";\n" +
                                    "cin >> numb;\n" +
                                    "}\n" +
                                    "total = total + numb;\n" +
                                    "}\n" +
                                    "average = total/MAX;\n" +
                                    "cout << \"The average number is: \" << average << \"\\n\";\n" +
                                    "return 0;\n" +
                                    "}\n" +
                                    "11. Write a short code using C++ to print out all odd number from 1 to 100 using a for loop\n" +
                                    "for( unsigned int i = 1; i < = 100; i++ )\n" +
                                    "if( i & 0x00000001 )\n" +
                                    "cout << i << \\\",\\\";\n" +
                                    " \n" +
                                    "12. What is public, protected, private?\n" +
                                    "Public, protected and private are three access specifier in C++.\n" +
                                    "Public data members and member functions are accessible outside the class.\n" +
                                    "Protected data members and member functions are only available to derived classes.\n" +
                                    "Private data members and member functions can’t be accessed outside the class. However there is an exception can be using friend classes.\n" +
                                    " \n" +
                                    "13. Tell how to check whether a linked list is circular.\n" +
                                    "Create two pointers, each set to the start of the list. Update each as follows: while (pointer1) {\n" +
                                    "pointer1 = pointer1->next;\n" +
                                    "pointer2 = pointer2->next; if (pointer2) pointer2=pointer2->next;\n" +
                                    "if (pointer1 == pointer2) {\n" +
                                    "print (\\\"circular\\n\\\");\n" +
                                    "}\n" +
                                    "}\n" +
                                    "OK, why does this work?\n" +
                                    "If a list is circular, at some point pointer2 will wrap around and be either at the item just before pointer1, or the item before that. Either way, it’s either 1 or 2 jumps until they meet.\n" +
                                    " \n" +
                                    "14. What is virtual constructors/destructors?\n" +
                                    "Virtual destructors:If an object (with a non-virtual destructor) is destroyed explicitly by applying the delete operator to a base-class pointer to the object, the base-class destructor function (matching the pointer type) is called on the object.\n" +
                                    "There is a simple solution to this problem declare a virtual base-class destructor. This makes all derived-class destructors virtual even though they don’t have the same name as the base-class destructor. Now, if the object in the hierarchy is destroyed explicitly by applying the delete operator to a base-class pointer to a derived-class object, the destructor for the appropriate class is called. Virtual constructor: Constructors cannot be virtual. Declaring a constructor as a virtual function is a syntax error.\n" +
                                    "Virtual destructors: If an object (with a non-virtual destructor) is destroyed explicitly by applying the delete operator to a base-class pointer to the object, the base-class destructor function (matching the pointer type) is called on the object.\n" +
                                    "There is a simple solution to this problem – declare a virtual base-class destructor. This makes all derived-class destructors virtual even though they don’t have the same name as the base-class destructor. Now, if the object in the hierarchy is destroyed explicitly by applying the delete operator to a base-class pointer to a derived-class object, the destructor for the appropriate class is called.\n" +
                                    "Virtual constructor: Constructors cannot be virtual. Declaring a constructor as a virtual function is a syntax error.\n" +
                                    " \n" +
                                    "15.  Does c++ support multilevel and multiple inheritance?\n" +
                                    "Yes.\n" +
                                    "16.  What are the advantages of inheritance?\n" +
                                    "• It permits code reusability.\n" +
                                    "• Reusability saves time in program development.\n" +
                                    "• It encourages the reuse of proven and debugged high-quality software, thus reducing problem after a system becomes functional.\n" +
                                    " \n" +
                                    "17.  What is the difference between declaration and definition?\n" +
                                    "The declaration tells the compiler that at some later point we plan to present the definition of this declaration.\n" +
                                    "E.g.: void stars () //function declaration\n" +
                                    "The definition contains the actual implementation.\n" +
                                    "E.g.: void stars () // declarator\n" +
                                    "{\n" +
                                    "for(int j=10; j>=0; j--) //function body\n" +
                                    "cout<<”*”;\n" +
                                    "cout<<endl;\n" +
                                    " }\n" +
                                    " \n" +
                                    "18. What is the difference between an array and a list?\n" +
                                    "Array is collection of homogeneous elements. List is collection of heterogeneous elements.\n" +
                                    "For Array memory allocated is static and continuous. For List memory allocated is dynamic and Random.\n" +
                                    "Array: User need not have to keep in track of next memory allocation.\n" +
                                    "List: User has to keep in Track of next location where memory is allocated.\n" +
                                    "Array uses direct access of stored members, list uses sequencial access for members.\n" +
                                    "/With Array you have direct access to memory position 5\n" +
                                    "Object x = a[5]; // x takes directly a reference to 5th element of array\n" +
                                    "//With the list you have to cross all previous nodes in order to get the 5th node:\n" +
                                    "list mylist;\n" +
                                    "list::iterator it;\n" +
                                    "for( it = list.begin() ; it != list.end() ; it++ )\n" +
                                    "{\n" +
                                    "if( i==5)\n" +
                                    "{\n" +
                                    "x = *it;\n" +
                                    "break;\n" +
                                    "}\n" +
                                    "i++;\n" +
                                    "}\n" +
                                    " \n" +
                                    "19. What is a template?\n" +
                                    "Templates allow to create generic functions that admit any data type as parameters and return value without having to overload the function with all the possible data types. Until certain point they fulfill the functionality of a macro. Its prototype is any of the two following ones:\n" +
                                    "template <class indetifier> function_declaration; template <typename indetifier> function_declaration;\n" +
                                    "The only difference between both prototypes is the use of keyword class or typename, its use is indistinct since both expressions have exactly the same meaning and behave exactly the same way.\n" +
                                    " \n" +
                                    "20. Define a constructor - What it is and how it might be called (2 methods).\n" +
                                    "Constructor is a member function of the class, with the name of the function being the same as the class name. It also specifies how the object should be initialized.\n" +
                                    "Ways of calling constructor:\n" +
                                    "1) Implicitly: automatically by complier when an object is created.\n" +
                                    "2) Calling the constructors explicitly is possible, but it makes the code unverifiable.\n" +
                                    "class Point2D{\n" +
                                    "int x; int y;\n" +
                                    "public Point2D() : x(0) , y(0) {} //default (no argument) constructor\n" +
                                    "};\n" +
                                    "main(){\n" +
                                    "Point2D MyPoint; // Implicit Constructor call. In order to allocate memory on stack, the default constructor is implicitly called.\n" +
                                    "Point2D * pPoint = new Point2D(); // Explicit Constructor call. In order to allocate memory on HEAP we call the default constructor. \n" +
                                    "You have two pairs: new() and delete() and another pair : alloc() and free().\n" +
                                    " \n" +
                                    "21.  Explain differences between eg. new() and malloc()\n" +
                                    "1.) “new and delete” are preprocessors while “malloc() and free()” are functions. [we dont use brackets will calling new or delete].\n" +
                                    "2.) no need of allocate the memory while using “new” but in “malloc()” we have to use “sizeof()”.\n" +
                                    "3.) “new” will initlize the new memory to 0 but “malloc()” gives random value in the new alloted memory location [better to use calloc()]\n" +
                                    "new() allocates continous space for the object instace malloc() allocates distributed space.\n" +
                                    "new() is castless, meaning that allocates memory for this specific type,\n" +
                                    "malloc(), calloc() allocate space for void * that is cated to the specific class type pointer.\n" +
                                    "22. What is the difference between class and structure?\n" +
                                    "Structure: Initially (in C) a structure was used to bundle different type of data types together to perform a particular functionality. But C++ extended the structure to contain functions also. The major difference is that all declarations inside a structure are by default public.\n" +
                                    "Class: Class is a successor of Structure. By default all the members inside the class are private.\n" +
                                    " \n" +
                                    "23. What is RTTI?\n" +
                                    "Runtime type identification (RTTI) lets you find the dynamic type of an object when you have only a pointer or a reference to the base type. RTTI is the official way in standard C++ to discover the type of an object and to convert the type of a pointer or reference (that is, dynamic typing).\n" +
                                    " \n" +
                                    "24.What is encapsulation?\n" +
                                    "Packaging an object’s variables within its methods is called encapsulation.\n" +
                                    " \n" +
                                    "25.Explain term “Polymorphism” and give an example using eg. SHAPE object: If I have a base class SHAPE, how would I define DRAW methods for two objects CIRCLE and SQUARE“Polymorphism”: A phenomenon which enables an object to react differently to the same function call. in C++ it is attained by using a keyword virtual\n" +
                                    "Example\n" +
                                    "public class SHAPE\n" +
                                    "{\n" +
                                    "public virtual void SHAPE::DRAW()=0;\n" +
                                    "}\n" +
                                    "Note here the function DRAW() is pure virtual which means the sub classes must implement the DRAW() method and SHAPE cannot be instatiated\n" +
                                    "public class CIRCLE::public SHAPE\n" +
                                    "{\n" +
                                    "public void CIRCLE::DRAW()\n" +
                                    "{\n" +
                                    "// TODO drawing circle\n" +
                                    "}\n" +
                                    "}\n" +
                                    "public class SQUARE::public SHAPE\n" +
                                    "{\n" +
                                    "public void SQUARE::DRAW()\n" +
                                    "{\n" +
                                    "// TODO drawing square\n" +
                                    "}\n" +
                                    "}\n" +
                                    "now from the user class the calls would be like globally\n" +
                                    "SHAPE *newShape;\n" +
                                    "When user action is to draw\n" +
                                    "public void MENU::OnClickDrawCircle(){\n" +
                                    "newShape = new CIRCLE();\n" +
                                    "}\n" +
                                    "public void MENU::OnClickDrawCircle(){\n" +
                                    "newShape = new SQUARE();\n" +
                                    "}\n" +
                                    "the when user actually draws\n" +
                                    "public void CANVAS::OnMouseOperations(){\n" +
                                    "newShape->DRAW();\n" +
                                    "}\n" +
                                    "class SHAPE{\n" +
                                    "public virtual Draw() = 0; //abstract class with a pure virtual method\n" +
                                    "};\n" +
                                    "class CIRCLE{\n" +
                                    "public int r;\n" +
                                    "public virtual Draw() { this->drawCircle(0,0,r); }\n" +
                                    "};\n" +
                                    "class SQURE\n" +
                                    "public int a;\n" +
                                    "public virtual Draw() { this->drawRectangular(0,0,a,a); }\n" +
                                    "};\n" +
                                    "Each object is driven down from SHAPE implementing Draw() function in its own way.\n" +
                                    " \n" +
                                    "26. What is an object?\n" +
                                    "Object is a software bundle of variables and related methods. Objects have state and behavior.\n" +
                                    " \n" +
                                    "27. How can you tell what shell you are running on UNIX system?\n" +
                                    "You can do the Echo $RANDOM. It will return a undefined variable if you are from the C-Shell, just a return prompt if you are from the Bourne shell, and a 5 digit random numbers if you are from the Korn shell. You could also do a ps -l and look for the shell with the highest PID.\n" +
                                    " \n" +
                                    "28. What do you mean by inheritance?\n" +
                                    "Inheritance is the process of creating new classes, called derived classes, from existing classes or base classes. The derived class inherits all the capabilities of the base class, but can add embellishments and refinements of its own.\n" +
                                    " \n" +
                                    "29.Describe PRIVATE, PROTECTED and PUBLIC – the differences and give examples.\n" +
                                    "class Point2D{\n" +
                                    "int x; int y;\n" +
                                    "public int color;\n" +
                                    "protected bool pinned;\n" +
                                    "public Point2D() : x(0) , y(0) {} //default (no argument) constructor\n" +
                                    "};\n" +
                                    "Point2D MyPoint;\n" +
                                    "You cannot directly access private data members when they are declared (implicitly) private:\n" +
                                    "MyPoint.x = 5; // Compiler will issue a compile ERROR\n" +
                                    "//Nor yoy can see them:\n" +
                                    "int x_dim = MyPoint.x; // Compiler will issue a compile ERROR\n" +
                                    "On the other hand, you can assign and read the public data members:\n" +
                                    "MyPoint.color = 255; // no problem\n" +
                                    "int col = MyPoint.color; // no problem\n" +
                                    "With protected data members you can read them but not write them: MyPoint.pinned = true; // Compiler will issue a compile ERROR\n" +
                                    "bool isPinned = MyPoint.pinned; // no problem\n" +
                                    " \n" +
                                    "30. What is namespace?\n" +
                                    "Namespaces allow us to group a set of global classes, objects and/or functions under a name. To say it somehow, they serve to split the global scope in sub-scopes known as namespaces.\n" +
                                    "The form to use namespaces is:\n" +
                                    "namespace identifier { namespace-body }\n" +
                                    "Where identifier is any valid identifier and namespace-body is the set of classes, objects and functions that are included within the namespace. For example:\n" +
                                    "namespace general { int a, b; } In this case, a and b are normal variables integrated within the general namespace. In order to access to these variables from outside the namespace we have to use the scope operator ::. For example, to access the previous variables we would have to put:\n" +
                                    "general::a general::b\n" +
                                    "The functionality of namespaces is specially useful in case that there is a possibility that a global object or function can have the same name than another one, causing a redefinition error.\n" +
                                    " \n" +
                                    "31. What is a COPY CONSTRUCTOR and when is it called?\n" +
                                    "A copy constructor is a method that accepts an object of the same class and copies it’s data members to the object on the left part of assignment:\n" +
                                    "class Point2D{\n" +
                                    "int x; int y;\n" +
                                    "public int color;\n" +
                                    "protected bool pinned;\n" +
                                    "public Point2D() : x(0) , y(0) {} //default (no argument) constructor\n" +
                                    "public Point2D( const Point2D & ) ;\n" +
                                    "};\n" +
                                    "Point2D::Point2D( const Point2D & p )\n" +
                                    "{\n" +
                                    "this->x = p.x;\n" +
                                    "this->y = p.y;\n" +
                                    "this->color = p.color;\n" +
                                    "this->pinned = p.pinned;\n" +
                                    "}\n" +
                                    "main(){\n" +
                                    "Point2D MyPoint;\n" +
                                    "MyPoint.color = 345;\n" +
                                    "Point2D AnotherPoint = Point2D( MyPoint ); // now AnotherPoint has color = 345\n" +
                                    " \n" +
                                    "32. What is Boyce Codd Normal form?\n" +
                                    "A relation schema R is in BCNF with respect to a set F of functional dependencies if for all functional dependencies in F+ of the form a-> , where a and b is a subset of R, at least one of the following holds:\n" +
                                    "* a- > b is a trivial functional dependency (b is a subset of a)\n" +
                                    "* a is a superkey for schema R\n" +
                                    " \n" +
                                    "33. What is virtual class and friend class?\n" +
                                    "Friend classes are used when two or more classes are designed to work together and need access to each other's implementation in ways that the rest of the world shouldn't be allowed to have. In other words, they help keep private things private. For instance, it may be desirable for class DatabaseCursor to have more privilege to the internals of class Database than main() has.\n" +
                                    " \n" +
                                    "34. What is the word you will use when defining a function in base class to allow this function to be a polimorphic function?\n" +
                                    "virtual\n" +
                                    " \n" +
                                    "35. What do you mean by binding of data and functions?\n" +
                                    "Encapsulation.\n" +
                                    " \n" +
                                    "36. What are 2 ways of exporting a function from a DLL?\n" +
                                    "1. Taking a reference to the function from the DLL instance.\n" +
                                    "2. Using the DLL ’s Type Library\n" +
                                    " \n" +
                                    "37. What is the difference between an object and a class?\n" +
                                    "Classes and objects are separate but related concepts. Every object belongs to a class and every class contains one or more related objects.\n" +
                                    "- A Class is static. All of the attributes of a class are fixed before, during, and after the execution of a program. The attributes of a class don't change.\n" +
                                    "- The class to which an object belongs is also (usually) static. If a particular object belongs to a certain class at the time that it is created then it almost certainly will still belong to that class right up until the time that it is destroyed.\n" +
                                    "- An Object on the other hand has a limited lifespan. Objects are created and eventually destroyed. Also during that lifetime, the attributes of the object may undergo significant change.\n" +
                                    " \n" +
                                    "38. What is a class?\n" +
                                    "Class is a user-defined data type in C++. It can be created to solve a particular kind of problem. After creation the user need not know the specifics of the working of a class.\n" +
                                    " \n" +
                                    "39. What is friend function?\n" +
                                    "As the name suggests, the function acts as a friend to a class. As a friend of a class, it can access its private and protected members. A friend function is not a member of the class. But it must be listed in the class definition.\n" +
                                    " \n" +
                                    "40. Which recursive sorting technique always makes recursive calls to sort subarrays that are about half size of the original array?\n" +
                                    "Mergesort always makes recursive calls to sort subarrays that are about half size of the original array, resulting in O(n log n) time.\n" +
                                    " \n" +
                                    "41. What is abstraction?\n" +
                                    "Abstraction is of the process of hiding unwanted details from the user.\n" +
                                    " \n" +
                                    "42. What are virtual functions?\n" +
                                    "A virtual function allows derived classes to replace the implementation provided by the base class. The compiler makes sure the replacement is always called whenever the object in question is actually of the derived class, even if the object is accessed by a base pointer rather than a derived pointer. This allows algorithms in the base class to be replaced in the derived class, even if users don't know about the derived class.\n" +
                                    " \n" +
                                    "43.What is the difference between an external iterator and an internal iterator? Describe an advantage of an external iterator.\n" +
                                    "An internal iterator is implemented with member functions of the class that has items to step through. .An external iterator is implemented as a separate class that can be \"attach\" to the object that has items to step through. .An external iterator has the advantage that many difference iterators can be active simultaneously on the same object.\n" +
                                    " \n" +
                                    "44. What is a scope resolution operator?\n" +
                                    "A scope resolution operator (::), can be used to define the member functions of a class outside the class.\n" +
                                    " \n" +
                                    "45. What do you mean by pure virtual functions?\n" +
                                    "A pure virtual member function is a member function that the base class forces derived classes to provide. Normally these member functions have no implementation. Pure virtual functions are equated to zero.\n" +
                                    "class Shape { public: virtual void draw() = 0; };\n" +
                                    " \n" +
                                    "46. What is polymorphism? Explain with an example?\n" +
                                    "\"Poly\" means \"many\" and \"morph\" means \"form\". Polymorphism is the ability of an object (or reference) to assume (be replaced by) or become many different forms of object.\n" +
                                    "Example: function overloading, function overriding, virtual functions. Another example can be a plus ‘+’ sign, used for adding two integers or for using it to concatenate two strings.\n" +
                                    " \n" +
                                    "47.What’s the output of the following program? Why?\n" +
                                    "#include <stdio.h>\n" +
                                    "main()\n" +
                                    "{\n" +
                                    "typedef union\n" +
                                    "{\n" +
                                    "int a;\n" +
                                    "char b[10];\n" +
                                    "float c;\n" +
                                    "}\n" +
                                    "Union;\n" +
                                    "Union x,y = {100};\n" +
                                    "x.a = 50;\n" +
                                    "strcpy(x.b,\\\"hello\\\");\n" +
                                    "x.c = 21.50;\n" +
                                    "printf(\\\"Union x : %d %s %f \\n\\\",x.a,x.b,x.c );\n" +
                                    "printf(\\\"Union y :%d %s%f \\n\\\",y.a,y.b,y.c);\n" +
                                    "}\n" +
                                    "Given inputs X, Y, Z and operations | and & (meaning bitwise OR and AND, respectively)\n" +
                                    "What is output equal to in\n" +
                                    "output = (X & Y) | (X & Z) | (Y & Z)\n" +
                                    " \n" +
                                    "48. Why arrays are usually processed with for loop?\n" +
                                    "The real power of arrays comes from their facility of using an index variable to traverse the array, accessing each element with the same expression a[i]. All the is needed to make this work is a iterated statement in which the variable i serves as a counter, incrementing from 0 to a.length -1. That is exactly what a loop does.\n" +
                                    " \n" +
                                    "49. What is an HTML tag?\n" +
                                    "An HTML tag is a syntactical construct in the HTML language that abbreviates specific instructions to be executed when the HTML script is loaded into a Web browser. It is like a method in Java, a function in C++, a procedure in Pascal, or a subroutine in FORTRAN.\n" +
                                    " \n" +
                                    "50.Explain which of the following declarations will compile and what will be constant - a pointer or the value pointed at: * const char *\n" +
                                    "* char const *\n" +
                                    "* char * const\n" +
                                    " \n" +
                                    "51. What problems might the following macro bring to the application?\n" +
                                    "#define sq(x) x*x\n" +
                                    " \n" +
                                    "52. Anything wrong with this code?\n" +
                                    "T *p = new T[10];\n" +
                                    "delete p;\n" +
                                    "Everything is correct, Only the first element of the array will be deleted”, The entire array will be deleted, but only the first element destructor will be called.\n" +
                                    " \n" +
                                    "53. Anything wrong with this code?\n" +
                                    "T *p = 0;\n" +
                                    "delete p;\n" +
                                    "Yes, the program will crash in an attempt to delete a null pointer.\n" +
                                    " \n" +
                                    "54. How do you decide which integer type to use?\n" +
                                    "It depends on our requirement. When we are required an integer to be stored in 1 byte (means less than or equal to 255) we use short int, for 2 bytes we use int, for 8 bytes we use long int.\n" +
                                    "A char is for 1-byte integers, a short is for 2-byte integers, an int is generally a 2-byte or 4-byte integer (though not necessarily), a long is a 4-byte integer, and a long long is a 8-byte integer.\n" +
                                    " \n" +
                                    "55. What does extern mean in a function declaration?\n" +
                                    "Using extern in a function declaration we can make a function such that it can used outside the file in which it is defined.\n" +
                                    "An extern variable, function definition, or declaration also makes the described variable or function usable by the succeeding part of the current source file. This declaration does not replace the definition. The declaration is used to describe the variable that is externally defined.\n" +
                                    "If a declaration for an identifier already exists at file scope, any extern declaration of the same identifier found within a block refers to that same object. If no other declaration for the identifier exists at file scope, the identifier has external linkage.\n" +
                                    " \n" +
                                    "56. What can I safely assume about the initial values of variables which are not explicitly initialized?\n" +
                                    "It depends on complier which may assign any garbage value to a variable if it is not initialized.\n" +
                                    " \n" +
                                    "57. What is the difference between char a[] = “string”; and char *p = “string”;?\n" +
                                    "In the first case 6 bytes are allocated to the variable a which is fixed, where as in the second case if *p is assigned to some other value the allocate memory can change.\n" +
                                    "58. What’s the auto keyword good for?\n" +
                                    "Not much. It declares an object with automatic storage duration. Which means the object will be destroyed at the end of the objects scope. All variables in functions that are not declared as static and not dynamically allocated have automatic storage duration by default.\n" +
                                    "For example\n" +
                                    "int main()\n" +
                                    "{\n" +
                                    "int a; //this is the same as writing “auto int a;”\n" +
                                    "}\n" +
                                    "Local variables occur within a scope; they are “local” to a function. They are often called automatic variables because they automatically come into being when the scope is entered and automatically go away when the scope closes. The keyword auto makes this explicit, but local variables default to auto auto auto auto so it is never necessary to declare something as an auto auto auto auto.\n" +
                                    " \n" +
                                    "59. What is the difference between char a[] = “string”; and char *p = “string”; ?\n" +
                                    "a[] = “string”;\n" +
                                    "char *p = “string”;\n" +
                                    "The difference is this:\n" +
                                    "p is pointing to a constant string, you can never safely say\n" +
                                    "p[3]=’x';\n" +
                                    "however you can always say a[3]=’x';\n" +
                                    "char a[]=”string”; - character array initialization.\n" +
                                    "char *p=”string” ; - non-const pointer to a const-string.( this is permitted only in the case of char pointer in C++ to preserve backward compatibility with C.)\n" +
                                    " \n" +
                                    "60. How do I declare an array of N pointers to functions returning pointers to functions returning pointers to characters?\n" +
                                    "If you want the code to be even slightly readable, you will use typedefs.\n" +
                                    "typedef char* (*functiontype_one)(void);\n" +
                                    "typedef functiontype_one (*functiontype_two)(void);\n" +
                                    "functiontype_two myarray[N]; //assuming N is a const integral\n" +
                                    " \n" +
                                    "61. What does extern mean in a function declaration?\n" +
                                    "It tells the compiler that a variable or a function exists, even if the compiler hasn’t yet seen it in the file currently being compiled. This variable or function may be defined in another file or further down in the current file.\n" +
                                    " \n" +
                                    "62. How do I initialize a pointer to a function?\n" +
                                    "This is the way to initialize a pointer to a function\n" +
                                    "void fun(int a)\n" +
                                    "{\n" +
                                    "}\n" +
                                    "void main()\n" +
                                    "{\n" +
                                    "void (*fp)(int);\n" +
                                    "fp=fun;\n" +
                                    "fp(1);\n" +
                                    "}\n" +
                                    " \n" +
                                    "63. How do you link a C++ program to C functions?\n" +
                                    "By using the extern \"C\" linkage specification around the C function declarations.\n" +
                                    " \n" +
                                    "64. Explain the scope resolution operator.\n" +
                                    "It permits a program to reference an identifier in the global scope that has been hidden by another identifier with the same name in the local scope.\n" +
                                    " \n" +
                                    "65. What are the differences between a C++ struct and C++ class?\n" +
                                    "The default member and base-class access specifier are different.\n" +
                                    " \n" +
                                    "66. How many ways are there to initialize an int with a constant?\n" +
                                    "Two. There are two formats for initializers in C++ as shown in the example that follows. The first format uses the traditional C notation. The second format uses constructor notation.\n" +
                                    "int foo = 123;\n" +
                                    "int bar (123);\n" +
                                    " \n" +
                                    "67. How does throwing and catching exceptions differ from using setjmp and longjmp?\n" +
                                    "The throw operation calls the destructors for automatic objects instantiated since entry to the try block.\n" +
                                    " \n" +
                                    "68. What is a default constructor?\n" +
                                    "Default constructor WITH arguments class B { public: B (int m = 0) : n (m) {} int n; }; int main(int argc, char *argv[]) { B b; return 0; }\n" +
                                    " \n" +
                                    "69. What is a conversion constructor?\n" +
                                    "A constructor that accepts one argument of a different type.\n" +
                                    " \n" +
                                    "70. What is the difference between a copy constructor and an overloaded assignment operator?\n" +
                                    "A copy constructor constructs a new object by using the content of the argument object. An overloaded assignment operator assigns the contents of an existing object to another existing object of the same class.\n" +
                                    " \n" +
                                    "71. When should you use multiple inheritance?\n" +
                                    "There are three acceptable answers: \"Never,\" \"Rarely,\" and \"When the problem domain cannot be accurately modeled any other way.\"\n" +
                                    " \n" +
                                    "72. Explain the ISA and HASA class relationships. How would you implement each in a class design?\n" +
                                    "A specialized class \"is\" a specialization of another class and, therefore, has the ISA relationship with the other class. An Employee ISA Person. This relationship is best implemented with inheritance. Employee is derived from Person. A class may have an instance of another class. For example, an employee \"has\" a salary, therefore the Employee class has the HASA relationship with the Salary class. This relationship is best implemented by embedding an object of the Salary class in the Employee class.\n" +
                                    " \n" +
                                    "73. When is a template a better solution than a base class?\n" +
                                    "When you are designing a generic class to contain or otherwise manage objects of other types, when the format and behavior of those other types are unimportant to their containment or management, and particularly when those other types are unknown (thus, the generosity) to the designer of the container or manager class.\n" +
                                    " \n" +
                                    "74. What is a mutable member?\n" +
                                    "One that can be modified by the class even when the object of the class or the member function doing the modification is const.\n" +
                                    " \n" +
                                    "75. What is an explicit constructor?\n" +
                                    "A conversion constructor declared with the explicit keyword. The compiler does not use an explicit constructor to implement an implied conversion of types. It’s purpose is reserved explicitly for construction.\n" +
                                    " \n" +
                                    "76. What is the Standard Template Library (STL)?\n" +
                                    "A library of container templates approved by the ANSI committee for inclusion in the standard C++ specification. A programmer who then launches into a discussion of the generic programming model, iterators, allocators, algorithms, and such, has a higher than average understanding of the new technology that STL brings to C++ programming.\n" +
                                    " \n" +
                                    "77. Describe run-time type identification.\n" +
                                    "The ability to determine at run time the type of an object by using the typeid operator or the dynamic cast operator.\n" +
                                    " \n" +
                                    "78. What problem does the namespace feature solve?\n" +
                                    "Multiple providers of libraries might use common global identifiers causing a name collision when an application tries to link with two or more such libraries. The namespace feature surrounds a library’s external declarations with a unique namespace that eliminates the potential for those collisions.\n" +
                                    "This solution assumes that two library vendors don’t use the same namespace identifier, of course.\n" +
                                    " \n" +
                                    "79. Are there any new intrinsic (built-in) data types?\n" +
                                    "Yes. The ANSI committee added the bool intrinsic type and its true and false value keywords.\n" +
                                    "80. Will the following program execute?\n" +
                                    "void main()\n" +
                                    "{\n" +
                                    "void *vptr = (void *) malloc(sizeof(void));\n" +
                                    "vptr++;\n" +
                                    "}\n" +
                                    "It will throw an error, as arithmetic operations cannot be performed on void pointers.\n" +
                                    " \n" +
                                    "81. For the following C program\n" +
                                    "#define AREA(x)(3.14*x*x)\n" +
                                    "main()\n" +
                                    "{\n" +
                                    "float r1=6.25,r2=2.5,a;\n" +
                                    "a=AREA(r1);\n" +
                                    "printf(\"\\n Area of the circle is %f\", a);\n" +
                                    "a=AREA(r2);\n" +
                                    "printf(\"\\n Area of the circle is %f\", a);\n" +
                                    "}\n" +
                                    "What is the output?\n" +
                                    "Ans. Area of the circle is 122.656250\n" +
                                    "Area of the circle is  19.625000\n" +
                                    " \n" +
                                    "82. void main()\n" +
                                    "{\n" +
                                    "int d=5;\n" +
                                    "printf(\"%f\",d);\n" +
                                    "}\n" +
                                    "Ans: Undefined\n" +
                                    "83. void main()\n" +
                                    "{\n" +
                                    "int i;\n" +
                                    "for(i=1;i<4,i++)\n" +
                                    "switch(i)\n" +
                                    "case 1: printf(\"%d\",i);break;\n" +
                                    "{\n" +
                                    "case 2:printf(\"%d\",i);break;\n" +
                                    "case 3:printf(\"%d\",i);break;\n" +
                                    "}\n" +
                                    "switch(i) case 4:printf(\"%d\",i);\n" +
                                    "}\n" +
                                    "Ans: 1,2,3,4\n" +
                                    " \n" +
                                    "84.void main()\n" +
                                    "{\n" +
                                    "char *s=\"\\12345s\\n\";\n" +
                                    "printf(\"%d\",sizeof(s));\n" +
                                    "}\n" +
                                    "Ans: 6\n" +
                                    " \n" +
                                    "85.void main()\n" +
                                    "{\n" +
                                    "unsigned i=1; /* unsigned char k= -1 => k=255; */\n" +
                                    "signed j=-1; /* char k= -1 => k=65535 */\n" +
                                    "/* unsigned or signed int k= -1 =>k=65535 */\n" +
                                    "if(i<j)\n" +
                                    "printf(\"less\");\n" +
                                    "else\n" +
                                    "if(i>j)\n" +
                                    "printf(\"greater\");\n" +
                                    "else\n" +
                                    "if(i==j)\n" +
                                    "printf(\"equal\");\n" +
                                    "}\n" +
                                    "Ans: less</j)\n" +
                                    " \n" +
                                    "86. void main()\n" +
                                    "{\n" +
                                    "float j;\n" +
                                    "j=1000*1000;\n" +
                                    "printf(\"%f\",j);\n" +
                                    "}\n" +
                                    "1. 1000000\n" +
                                    "2. Overflow\n" +
                                    "3. Error\n" +
                                    "4. None \n" +
                                    "Ans: 4\n" +
                                    "87. How do you declare an array of N pointers to functions returning  pointers to functions returning pointers to characters?\n" +
                                    "Ans: The first part of this question can be answered in at least three ways:\n" +
                                    "1. char *(*(*a[N])())();\n" +
                                    "2. Build the declaration up incrementally, using typedefs:\n" +
                                    "typedef char *pc;    /* pointer to char */\n" +
                                    "typedef pc fpc();    /* function returning pointer to char */\n" +
                                    "typedef fpc *pfpc;    /* pointer to above */\n" +
                                    "typedef pfpc fpfpc();    /* function returning... */\n" +
                                    "typedef fpfpc *pfpfpc;    /* pointer to... */\n" +
                                    "pfpfpc a[N];         /* array of... */\n" +
                                    "3. Use the cdecl program, which turns English into C and vice versa:\n" +
                                    "cdecl> declare a as array of pointer to function returning pointer to function returning pointer to char\n" +
                                    "char *(*(*a[])())()\n" +
                                    " \n" +
                                    "88.What is a modifier? \n" +
                                    "A modifier, also called a modifying function is a member function that changes the value of at least one data member. In other words, an operation that modifies the state of an object. Modifiers are also known as ‘mutators’.\n" +
                                    " \n" +
                                    "89.What is an accessor?\n" +
                                    "An accessor is a class operation that does not modify the state of an object. The accessor functions need to be declared as const operations \n" +
                                    " \n" +
                                    "90.Differentiate between a template class and class template.\n" +
                                    "Template class: A generic definition or a parameterized class not instantiated until the client provides the needed information. It’s jargon for plain templates. \n" +
                                    "Class template: A class template specifies how individual classes can be constructed much like the way class specifies how individual objects can be constructed. It’s jargon for plain classes\n" +
                                    " \n" +
                                    "91.When does a name clash occur? \n" +
                                    "A name clash occurs when a name is defined in more than one place. For example., two different class libraries could give two different classes the same name. If you try to use many class libraries at  the same time, there is a fair chance that you will be unable to compile or link the program because of name clashes. \n" +
                                    " \n" +
                                    "92.What is a dangling pointer? \n" +
                                    "A dangling pointer arises when you use the address of an object after its lifetime is over. This may occur in situations like returning addresses of the automatic variables from a function or using the address of the memory block after it is freed.\n" +
                                    " \n" +
                                    "93.Differentiate between the message and method.\n" +
                                    "Message:\n" +
                                    "Objects communicate by sending messages to each other.\n" +
                                    "A message is sent to invoke a method\n" +
                                    "Method:\n" +
                                    "Provides response to a message.\n" +
                                    "It is an implementation of an operation.\n" +
                                    " \n" +
                                    "94.What is an adaptor class or Wrapper class? \n" +
                                    "A class that has no functionality of its own. Its member functions hide the use of a third party software component or an object with the non-compatible interface or a non-object-oriented implementation. \n" +
                                    " \n" +
                                    "95.What is a Null object? \n" +
                                    "It is an object of some class whose purpose is to indicate that a real object of that class does not exist. One common use for a null object is a return value from a member function that is supposed to return an object with some specified properties but cannot find such an object.\n" +
                                    " \n" +
                                    "96.What is class invariant? \n" +
                                    "A class invariant is a condition that defines all valid states for an object. It is a logical condition to ensure the correct working of a class. Class invariants must hold when an object is created, and they  must be preserved under all operations of the class. In particular all class invariants are both preconditions and post-conditions for all operations or member functions of the class. \n" +
                                    " \n" +
                                    "97.What do you mean by Stack unwinding?\n" +
                                    "It is a process during exception handling when the destructor is called for all local objects between the place where the exception was thrown and where it is caught.\n" +
                                    " \n" +
                                    "98.What are proxy objects? \n" +
                                    "Objects that stand for other objects are called proxy objects or surrogates.\n" +
                                    " \n" +
                                    "99.Name some pure object oriented languages. \n" +
                                    "Smalltalk, Java, Eiffel, Sather.\n" +
                                    " \n" +
                                    "100.What is an orthogonal base class? \n" +
                                    "If two base classes have no overlapping methods or data they are said to be independent of, or orthogonal to each other. Orthogonal in the sense means that two classes operate in different  dimensions and do not interfere with each other in any way. The same derived class may inherit such classes with no difficulty.\n" +
                                    " \n" +
                                    "101.What is the difference between Mutex and Binary semaphore?\n" +
                                    "semaphore is used to synchronize processes. where as mutex is used to provide synchronization between threads running in the same process\n" +
                                    " \n" +
                                    "102.What is destructor?\n" +
                                    "Destructor usually deletes any extra resources allocated by the object. \n" +
                                    " \n" +
                                    "103.What are C++ storage classes?\n" +
                                    "auto\n" +
                                    "register\n" +
                                    "static\n" +
                                    "extern\n" +
                                    "auto:the default. Variables are automatically created and initialized when they are defined and are destroyed at the end of the block containing their definition. They are not visible outside that block\n" +
                                    "register:a type of auto variable. a suggestion to the compiler to use a CPU register for performance\n" +
                                    "static:a variable that is known only in the function that contains its definition but is never destroyed and retains its value between calls to that function. It exists from the time the program begins execution\n" +
                                    "extern:a static variable whose definition and placement is determined when all object and library modules are combined (linked) to form the executable code file. It can be visible outside the file where it is defined.\n" +
                                    " \n" +
                                    "104.What is reference ?\n" +
                                    "reference is a name that acts as an alias, or alternative name, for a previously defined variable or an object.prepending variable with \"&\" symbol makes it as reference.\n" +
                                    "for example: \n" +
                                    "int a;\n" +
                                    "int &b = a; \n" +
                                    "105.What are the defining traits of an object-oriented language?\n" +
                                    "The defining traits of an object-oriented langauge are:\n" +
                                    "encapsulation\n" +
                                    "inheritance\n" +
                                    "polymorphism\n" +
                                    " \n" +
                                    "106.What is Quadratic Probing?\n" +
                                    "The Performance problem encountered by linear probing is caused by the cluster buildup That occurs as a result of the probing sequence. Quadratic probing uses a different sequence to avoid primary clustering.\n" +
                                    " \n" +
                                    "107.What is the chaining?\n" +
                                    "The Chaining technique basically looks at the hash table as an array of pointers to linked lists. Each slot in the hash table is either empty or simply consists of a pointer to a linked list. You resolve collisions by adding the elements that hash to the same slot to the linked list to which that slot points. At the same time, deletions are easy, You simply delete elements from the linked list.\n" +
                                    " \n" +
                                    "108.What is the Hash Function?\n" +
                                    "The hash function is an important part of the hashing technique. This function is used to transform the keys into table addresses. The hash function we choose should be easy to compute and should be able to transform the keys into integers in the range 0 to TR-1. Because most of the commonly used hash functions are based on arithmetic operations, We should convert the keys to numbers on which arithmetic operations can be performed\n" +
                                    " \n" +
                                    "109.What is an Visualizations?\n" +
                                    "The visualization is the basically a way of presentation ,Its just a fancy name for the diagrams, pictures, screen shots, prototypes, and any other visual representations created to help through and design the graphical user interface of your product.\n" +
                                    " \n" +
                                    "110.What is virtual inheritance? \n" +
                                    "Inheritance is a basically can be private , public, or virtual. With virtual inheritance there is only one copy of each object even if the object appears more than once in the hierarchy.\n" +
                                    " \n" +
                                    "111.What is multithreading \n" +
                                    "Multithreading is defined as :It is the task of creating a new thread of execution within an existing process rather than starting a new process to begin a function. It is the ability of an operating system to concurrently run programs that have been divided into subcomponents, or threads. \n" +
                                    " \n" +
                                    "112.What is the use of using?\n" +
                                    "Using is bassically a namespace scope. Its directive used to declare the accessibility of identifiers declared within a namespace scope.\n" +
                                    " \n" +
                                    "113.What is the use of exception handling?\n" +
                                    "Exception handling is bassically used to detect exceptions becouse it can be taken a corresponding action\n" +
                                    " \n" +
                                    "114.What is EOF?\n" +
                                    "EOF bassically stands for End of File, It is used to check for the end of file when a file is being read.\n" +
                                    " \n" +
                                    "115.Define the parameterized macros?\n" +
                                    "Parameterized macros are use for the parameters . It is the one which consist of template with insertion points for the addition of parameters.\n" +
                                    " \n" +
                                    "116.What is overflow error?\n" +
                                    "Overflow error basically a type of arithmatic errors.It's caused by the result of an arithmetic operation being greater than the actual space provided by the system.\n" +
                                    " \n" +
                                    "117.What is a nested class? Why can it be useful?\n" +
                                    "Nested classes basically useful for organizing code and controlling access and dependencies. Nested classes obey access rules just like other parts of a class do.and that class is a class enclosed within the scope of another class.\n" +
                                    " \n" +
                                    "118.What are the disadvantages of C++?\n" +
                                    "a)It's not pure object oriented programming language.\n" +
                                    "b)Its a Platform dependent\n" +
                                    "c)C++ does not give excellant graphics as compare to java.\n" +
                                    "d)Its Not case sensitive.\n" +
                                    "e)C++ have Less features as comapred to Java& C#.\n" +
                                    "f)Its Not applicable in web enviornment.\n" +
                                    "g)Does not provide very strong type-checking. \n" +
                                    "h)c++ code is easily prone to errors related to data types, their conversions.\n" +
                                    "i)Does not provide efficient means for garbage collection. \n" +
                                    "j)No built in support for threads\n" +
                                    " \n" +
                                    "119.What is an iterator?\n" +
                                    "An iterator is a bassically a type of object that represents a stream of data. It is Unlike a sequence, an iterator can only provide the next item. The for-in statement uses iterators to control the loop, and iterators can also be used in many other contexts\n" +
                                    " \n" +
                                    "120.What is the Auto Storage Class?\n" +
                                    "Auto Storage Class is bassically the default. Variables are automatically created and initialized, When they are defined and are destroyed at the end of the block containing their definition. They are not visible outside that block.\n" +
                                    " \n" +
                                    "121.What is callback function?\n" +
                                    "Callback function is the type of pointer for a function\n" +
                                    " \n" +
                                    "122.What is the use of tellg ()?\n" +
                                    "tellg () provides a information about the current position of input/get pointer.\n" +
                                    " \n" +
                                    "123.What is the use of tellp ()?\n" +
                                    "tellp ()use for the poitner postion :Its provides the current position of output/put pointer\n" +
                                    " \n" +
                                    "124.Define the generic programming?\n" +
                                    "Generic Programmng is type of method. The method in which generic types are used as arguments in algorithms for different data types and data structures is called generic programming.\n" +
                                    " \n" +
                                    "125.What is the use of Microsoft foundation class library?\n" +
                                    "The Microsoft Foundation Class Library also called as A Microsoft Foundation Classes or MFC. It is basically a library that wraps portions of the Windows API in C++ classes, and including functionality that enables them to use a default application framework. Classes are defined for many of the handle-managed Windows objects and also for predefined windows and common controls. MFC library would help us reduce the code and development time." +
                                    "\n";
                            String site2 = "C/C++";

                            Intent intent = new Intent(v.getContext(), CSS.class);
                            intent.putExtra(SITE1_KEY, site1);
                            intent.putExtra(SITE2_KEY, site2);
                            startActivity(intent);
                    }
            });

            javaa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            Toast.makeText(getBaseContext(), "Processing", Toast.LENGTH_SHORT).show();

                            String site1 = "Top 120 Java Interview Questions Answers\n" +
                                    "\n" +
                                    "So now the time has come to introduce you to this MEGA list of 120 Java questions collected from various interviews of last 5 years. I am sure you have seen many of these questions personally on your interviews and many of you would have answered them correctly as well.\n" +
                                    "\n" +
                                    "\n" +
                                    "Multithreading, Concurrency and Thread basics Questions\n" +
                                    "\n" +
                                    "\n" +
                                    "1) Can we make array volatile in Java?\n" +
                                    "Yes, you can make an array volatile in Java but only the reference which is pointing to an array, not the whole array. What I mean, if one thread changes the reference variable to points to another array, that will provide volatile guarantee, but if multiple threads are changing individual array elements they won't be having happens before guarantee provided by volatile modifier.\n" +
                                    "\n" +
                                    "\n" +
                                    "2) Can volatile make a non-atomic operation to atomic?\n" +
                                    "One example I have seen is having a long field in your class. If you know that a long field is accessed by more than one thread e.g. a counter, a price filed or anything, you better make it volatile. Why? because reading to a long variable is not atomic in Java and done in two steps, If one thread is writing or updating long value, it's possible for another thread to see half value (fist 32-bit). While reading/writing a volatile long or double (64 bit) is atomic.\n" +
                                    "\n" +
                                    "\n" +
                                    "3) What are practical uses of volatile modifier? \n" +
                                    "One of the practical use of volatile variable is to make reading double and long atomic. Both double and long are 64-bit wide and they are read in two parts, first 32-bit first time and next 32-bit second time, which is non-atomic but volatile double and long read is atomic in Java. Another use of volatile variable is to provide a memory barrier, just like it is used in Disrupter framework. Basically, Java Memory model inserts a write barrier after you write to volatile variable and a read barrier before you read it. Which means, if you write to volatile field then its guaranteed that any thread accessing that variable will see the value you wrote and anything you did before doing that write into the thread is guaranteed to have happened and any updated data values will also be visible to all threads, because the memory barrier flushed all other writes to the cache.\n" +
                                    "\n" +
                                    "\n" +
                                    "4) What guarantee volatile variable provides? (answer)\n" +
                                    "volatile variables provide the guarantee about ordering and visibility e.g. volatile assignment cannot be re-ordered with other statements but in the absence of any synchronization instruction compiler, JVM or JIT are free to reorder statements for better performance. volatile also provides the happens-before guarantee which ensure changes made in one thread is visible to others. In some cases volatile also provide atomicity e.g. reading 64-bit data types like long and double are not atomic but read of volatile double or long is atomic.\n" +
                                    "\n" +
                                    "\n" +
                                    "5) Which one would be easy to write? synchronization code for 10 threads or 2 threads?\n" +
                                    "In terms of writing code, both will be of same complexity because synchronization code is independent of a number of threads. Choice of synchronization though depends upon a number of threads because number of thread present more contention, so you go for advanced synchronization technique e.g. lock stripping, which require more complex code and expertise.\n" +
                                    "\n" +
                                    "\n" +
                                    "6) How do you call wait() method? using if block or loop? Why? (answer)\n" +
                                    "wait() method should always be called in loop because its possible that until thread gets CPU to start running again the condition might not hold, so its always better to check condition in loop before proceeding. Here is the standard idiom of using wait and notify method in Java:\n" +
                                    "// The standard idiom for using the wait method\n" +
                                    "synchronized (obj) {\n" +
                                    "   while (condition does not hold)\n" +
                                    "      obj.wait(); // (Releases lock, and reacquires on wakeup)\n" +
                                    "      ... // Perform action appropriate to condition\n" +
                                    "}\n" +
                                    "See Effective Java Item 69 to learn more about why wait method should call in the loop.\n" +
                                    "\n" +
                                    "\n" +
                                    "7)  What is false sharing in the context of multi-threading? \n" +
                                    "false sharing is one of the well-known performance issues on multi-core systems, where each process has its local cache. false sharing occurs when threads on different processor modify variables that reside on same cache line as shown in the following image:\n" +
                                    "\n" +
                                    "Java Interview questions for experienced programmers\n" +
                                    "\n" +
                                    "False sharing is very hard to detect because the thread may be accessing completely different global variables that happen to be relatively close together in memory. Like many concurrency issues, the primary way to avoid false sharing is careful code review and aligning your data structure with the size of a cache line.\n" +
                                    "\n" +
                                    "\n" +
                                    "8) What is busy spin? Why should you use it?\n" +
                                    "Busy spin is one of the technique to wait for events without releasing CPU. It's often done to avoid losing data in CPU cached which is lost if thread is paused and resumed in some other core. So, if you are working on low latency system where your order processing thread currently doesn't have any order, instead of sleeping or calling wait(), you can just loop and then again check the queue for new messages. It's only beneficial if you need to wait for very small amount of time e.g. in micro seconds or nano seconds. LMAX Disrupter framework, a high performance inter-thread messaging library has a BusySpinWaitStrategy which is based on this concept and uses busy spin loop for EventProcessors waiting on barrier.\n" +
                                    "\n" +
                                    "\n" +
                                    "9) How do you take thread dump in Java?\n" +
                                    "You can take a thread dump of Java application in Linux by using kill -3 PID, where PID is the process id of Java process. In Windows, you can press Ctrl + Break. This will instruct JVM to print thread dump in standard out or err and it could go to console or log file depending upon your application configuration. If you have used Tomcat then when\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "10) is Swing thread-safe? (answer)\n" +
                                    "No, Swing is not thread safe. You cannot update Swing components e.g. JTable, JList or JPanel from any thread, in fact they must be updated from GUI or AWT thread. That's why swings provides invokeAndWait() and invokeLater() method to request GUI update from any other threads. This methods put update request in AWT threads queue and can wait till update or return immediately for asynchronous update. You can also check detailed answer to learn more.\n" +
                                    "\n" +
                                    "\n" +
                                    "11) What is thread local variable in Java? (answer)\n" +
                                    "Thread-local variables are variables confined to thread, its like thread's own copy which is not shared between multiple thread. Java provides ThreadLocal class to support thread-local variables. It's one of the many way to achieve thread-safety. Though be careful while using thread local variable in manged environment e.g. with web servers where worker thread out live any application variable. Any thread local variable which is not removed once its work is done can potentially cause memory leak in Java application.\n" +
                                    "\n" +
                                    "\n" +
                                    "12) Write wait-notify code for producer-consumer problem? (answer)\n" +
                                    "Please see the answer for a code example. Just remember to call wait() and notify() method from synchronized block and test waiting condition on the loop instead of if block.\n" +
                                    "\n" +
                                    "\n" +
                                    "13) Write code for thread-safe Singleton in Java? (answer)\n" +
                                    "Please see the answer for code example and step by step guide to create thread-safe singleton class in Java. When we say thread-safe, which means Singleton should remain singleton even if initialization occur in case of multiple threads. Using Java enum as Singleton class is one of the easiest way to create thread-safe singleton in Java.\n" +
                                    "\n" +
                                    "\n" +
                                    "14) The difference between sleep and wait in Java? (answer)\n" +
                                    "Though both are used to pause currently running thread, sleep() is actually meant for short pause because it doesn't release lock, while wait() is meant for conditional wait and that's why it release lock which can then be acquired by another thread to change the condition on which it is waiting.\n" +
                                    "\n" +
                                    "\n" +
                                    "15) What is an immutable object? How do you create an Immutable object in Java? (answer)\n" +
                                    "Immutable objects are those whose state cannot be changed once created. Any modification will result in a new object e.g. String, Integer, and other wrapper class. Please see the answer for step by step guide to creating Immutable class in Java.\n" +
                                    "\n" +
                                    "\n" +
                                    "16) Can we create an Immutable object, which contains a mutable object?\n" +
                                    "Yes its possible to create a Immutable object which may contain mutable object, you just need to be little bit careful not to share the reference of mutable component, instead you should return copy of it if you have to. Most common example is an Object which contain the reference of java.util.Date object.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Date types and Basic Java Interview Questions\n" +
                                    "\n" +
                                    "\n" +
                                    "17) What is the right data type to represent a price in Java? (answer)\n" +
                                    "BigDecimal if memory is not a concern and Performance is not critical, otherwise double with predefined precision.\n" +
                                    "\n" +
                                    "\n" +
                                    "18) How do you convert bytes to String? (answer)\n" +
                                    "you can convert bytes to the string using string constructor which accepts byte[], just make sure that right character encoding otherwise platform default character encoding will be used which may or may not be same.\n" +
                                    "\n" +
                                    "\n" +
                                    "19) How do you convert bytes to long in Java? (answer)\n" +
                                    "This questions if for you to answer :-)\n" +
                                    "\n" +
                                    "\n" +
                                    "20) Can we cast an int value into byte variable? what will happen if the value of int is larger than byte?\n" +
                                    "Yes, we can cast but int is 32 bit long in java while byte is 8 bit long in java so when you cast int to byte higher 24 bits are lost and byte can only hold value from -128 to 128.\n" +
                                    "\n" +
                                    "\n" +
                                    "21) There are two classes B extends A and C extends B, Can we cast B into C e.g. C = (C) B; (answer)\n" +
                                    "\n" +
                                    "\n" +
                                    "22) Which class contains clone method? Cloneable or Object? (answer)\n" +
                                    "java.lang.Cloneable is marker interface and doesn't contain any method clone method is defined in the object class. It is also knowing that clone() is a native method means it's implemented in C or C++ or any other native language.\n" +
                                    "\n" +
                                    "\n" +
                                    "23) Is ++ operator is thread-safe in Java? (answer)\n" +
                                    " No its not a thread safe operator because its involve multiple instructions like reading a value, incriminating it and storing it back into memory which can be overlapped between multiple threads.\n" +
                                    "\n" +
                                    "\n" +
                                    "24) Difference between a = a + b and a += b ? (answer)\n" +
                                    "The += operator implicitly cast the result of addition into type of variable used to hold the result. When you add two integral variable e.g. variable of type byte, short, or int then they are first promoted to int and they addition happens. If result of addition is more than maximum value of a then a + b will give compile time error but a += b will be ok, as shown below\n" +
                                    "byte a = 127;\n" +
                                    "byte b = 127;\n" +
                                    "b = a + b; // error : cannot convert from int to byte\n" +
                                    "b += a; // ok\n" +
                                    "\n" +
                                    "\n" +
                                    "25) Can I store a double value in a long variable without casting? (answer)\n" +
                                    "No, you cannot store a double value into a long variable without casting because the range of double is more  that long and you we need to type cast.\n" +
                                    "\n" +
                                    "\n" +
                                    "26) What will this return 3*0.1 == 0.3? true or false? (answer)\n" +
                                    "false, because some floating point numbers can not be represented exactly.\n" +
                                    "\n" +
                                    "\n" +
                                    "27) Which one will take more memory, an int or Integer? (answer)\n" +
                                    "An Integer object will take more memory an Integer is the an object and it  store meta data overhead about the object and int is primitive type so its takes less space.\n" +
                                    "\n" +
                                    "\n" +
                                    "28) Why is String Immutable in Java? (answer)\n" +
                                    "The String is Immutable in java because java designer thought that string will be heavily used and making it immutable allow some optimization easy sharing same String object between multiple clients. See link for the more detailed answer.\n" +
                                    "\n" +
                                    "\n" +
                                    "29) Can we use String in the switch case? (answer)\n" +
                                    "yes from java 7 onward we can use String in switch case but it is just syntactic sugar. Internally string hash code is used for the switch.\n" +
                                    "see the detail ans for more ans.\n" +
                                    "\n" +
                                    "30) What is constructor chaining in Java? (answer)\n" +
                                    "When you call one constructor from other then its known as constructor chaining in Java. This happens when you have multiple, overloaded constructor in the class.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "JVM Internals and Garbage Collection Interview Questions\n" +
                                    "\n" +
                                    "31) What is the size of int in 64-bit JVM?\n" +
                                    "The size of an int variable is constant in Java, it's always 32-bit irrespective of platform. Which means the size of primitive int is same in both 32-bit and 64-bit Java virtual machine.\n" +
                                    "\n" +
                                    "32) Difference between Serial and Parallel Garbage Collector? (answer)\n" +
                                    "Even though both the serial and parallel collectors cause a stop-the-world pause during Garbage collection. Main difference between them is that a serial collector is a default copying collector which uses only one GC thread for garbage collection, while a parallel collector uses multiple GC threads for garbage collection.\n" +
                                    "\n" +
                                    "33) What is the size of int variable in 32-bit and 64-bit JVM? (answer)\n" +
                                    "Size of int is same in both 32-bit and 64-bit JVM, its always 32 bits or 4 bytes.\n" +
                                    "\n" +
                                    "34) Difference between WeakReference and SoftReference in Java? (answer)\n" +
                                    "Thoubh both WeakReference and SoftReference helps garbage collector and memory efficient, WeakReference become eligible for garbage collection as soon as last strong reference is lost but SoftReference even thought it can not prevent GC, it can delay it until JVM absolutely need memory.\n" +
                                    "\n" +
                                    "35) How does WeakHashMap works? (answer)\n" +
                                    "WeakHashMap works like a normal HashMap but uses WeakReference for keys, which means if key object doesn't have any reference then both key/value mapping will become eligible for garbage collection.\n" +
                                    "\n" +
                                    "36) What is -XX:+UseCompressedOops JVM option? Why use it? (answer)\n" +
                                    "When you go migrate your Java application from 32-bit to 64-bit JVM, the heap requirement suddenly increases, almost double, due to increase size of ordinary object pointer from 32 bit to 64 bit. This also adversely affect how much data you can keep in CPU cache, which is much smaller than memory memory. Since main motivation for moving to 64-bit JVM is to specify large heap size, you can save some memory by using compressed OOP. By using -XX:+UseCompressedOops, JVM uses 32-bit OOP instead of 64-bit OOP.\n" +
                                    "\n" +
                                    "\n" +
                                    "37) How do you find if JVM is 32-bit or 64-bit from Java Program? (answer)\n" +
                                    "You can find that by checking some system properties like sun.arch.data.model or os.arch\n" +
                                    "\n" +
                                    "\n" +
                                    "38) What is the maximum heap size of 32-bit and 64-bit JVM? (answer)\n" +
                                    "Theoretically the maximum heap memory you can assign to a 32-bit JVM is 2^32 which is 4GB but practically the limit is much smaller. It also varies between operating systems e.g. form 1.5GB in Windows to almost 3GB in Solaris. 64-bit JVM allows you to specify larger heap size, theoretically 2^64 which is quite large but practically you can specify heap space up to 100GBs. There are even JVM e.g. Azul where heap space of 1000 gigs is also possible.\n" +
                                    "\n" +
                                    "\n" +
                                    "39) What are the difference between JRE, JDK, JVM and JIT? (answer)\n" +
                                    "JRE stands for Java run-time and its required to run Java application. JDK stands for Java development kit and provides tools to develop Java program e.g. Java compiler. It also contains JRE. The JVM stands for Java virtual machine and it's the process responsible for running Java application. The JIT stands for Just In Time compilation and helps to boost performance of Java application by converting Java byte code into native code when the crossed certain threshold i.e. mainly hot code is converted into native code.\n" +
                                    "\n" +
                                    "Java Interview Questions for 3 years experience \n" +
                                    "\n" +
                                    "\n" +
                                    "40) Explain Java Heap space and Garbage collection? (answer)\n" +
                                    "When a Java process is started using java command, memory is allocated to it. Part of this memory is used to create heap space, which is used to allocate memory to objects whenever they are created in the program. Garbage collection is the process inside JVM which reclaims memory from dead objects for future allocation.\n" +
                                    "\n" +
                                    "JVM Internals Java Interview Questions Answers\n" +
                                    "\n" +
                                    "\n" +
                                    "41) Can you guarantee the garbage collection process? (answer)\n" +
                                    "No, you cannot guarantee the garbage collection, though you can make a request using System.gc() or Runtime.gc() method.\n" +
                                    "\n" +
                                    "\n" +
                                    "42) How do you find memory usage from Java program? How much percent of heap is used?\n" +
                                    "You can use memory related methods from java.lang.Runtime class to get the free memory, total memory and maximum heap memory in Java.  By using these methods you can find out how many percent of heap is used and how much heap space is remaining. Runtime.freeMemory() return amount of free memory in bytes, Runtime.totalMemory() returns total memory in bytes and Runtime.maxMemory() retuns maixmum memory in bytes.\n" +
                                    "\n" +
                                    "\n" +
                                    "43) What is the difference between stack and heap in Java? (answer)\n" +
                                    "Stack and heap are different memory areas in the JVM and they are used for different purposes. Stack is used to hold method frames and local variables, while objects are always allocated memory from heap. Stack is usually much smaller than heap memory and also didn't shared between multiple threads, but heap is shared among all threads in JVM.\n" +
                                    "\n" +
                                    "Java Interview Questions and Answers on Memory\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Basic Java concepts Interview Questions\n" +
                                    "\n" +
                                    "44) What's the difference between \"a == b\" and \"a.equals(b)\"? (answer)\n" +
                                    "The a = b does object reference matching if both a and b are object and only return true if both are pointing to the same object in the heap space, on the other hand a.equals(b) is used for logical mapping and its expected from an object to override this method to provide logical equality. For example, String class overrides this equals() method so that you can compare two Strings, which are the different object but contains same letters.\n" +
                                    "\n" +
                                    "\n" +
                                    "45) What is a.hashCode() used for? How is it related to a.equals(b)? (answer)\n" +
                                    "hashCode() method returns an int hash value corresponding to an object. It's used in hash based collection classes e.g Hashtable, HashMap, LinkedHashMap and so on. It's very tightly related to equals() method. According to Java specification, two objects which are equal to each other using equals() method must have same hash code.\n" +
                                    "\n" +
                                    "\n" +
                                    "46) Difference between final, finalize and finally? (answer)\n" +
                                    "final is a modifier which you can apply to variable, methods and classes. If you make a variable final it means its value cannot be changed once initialized. finalize is a method, which is called just before an object is garbage collected, giving it last chance to resurrect itself, but the call to finalize is not guaranteed. finally is a keyword which is used in exception handling along with try and catch. finally block is always executed irrespective of whether exception is thrown from try block or not.\n" +
                                    "\n" +
                                    "\n" +
                                    "47) What is compile time constant in Java? What is the risk of using it?\n" +
                                    "public static final variables are also known as compile time constant, public is optional there. They are replaced with actual values at compile time because compiler know their value up-front and also knows that it cannot be changed during run-time. One of the problem with this is that if you happened to use public static final variable from some in-house or third party library and their value changed later than your client will still be using old value even after you deploy new version of JARs. To avoid that, make sure you compile your program when you upgrade dependency JAR files.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Java Collections Framework Interview Questions\n" +
                                    "\n" +
                                    "It also contains Data structure and algorithm Interview question in Java, Array based Java Interview Questions\n" +
                                    "\n" +
                                    "48) The difference between List, Set, Map and Queue in Java? (answer)\n" +
                                    "The list is an ordered collection which allows duplicate. It also has an implementation which provides constant time index based access, but that is not guaranteed by List interface. Set is unordered collection which\n" +
                                    "\n" +
                                    "\n" +
                                    "49) Difference between poll() and remove() method?\n" +
                                    "Both poll() and remove() take out the object from the Queue but if poll() fails then it returns null but if remove fails it throws Exception.\n" +
                                    "\n" +
                                    "\n" +
                                    "50) Difference between LinkedHashMap and PriorityQueue in Java? (answer)\n" +
                                    "PriorityQueue guarantees that lowest or highest priority element always remain at the head of the queue, but LinkedHashMap maintains the order on which elements are inserted. When you iterate over a PriorityQueue, iterator doesn't guarantee any order but iterator of LinkedHashMap does guarantee the order on which elements are inserted.\n" +
                                    "\n" +
                                    "\n" +
                                    "51) Difference between ArrayList and LinkedList in Java? (answer)\n" +
                                    "The obvious difference between them is that ArrrayList is backed by array data structure, supprots random access and LinkedList is backed by linked list data structure and doesn't supprot random access. Accessing an element with index is O(1) in ArrayList but its O(n) in LinkedList. See the answer for more detailed discussion.\n" +
                                    "\n" +
                                    "\n" +
                                    "52) What are a couple of ways that you could sort a collection? (answer)\n" +
                                    "You can either use Sorted collection like TreeSet or TreeMap or you can sort using the ordered collection like a list and using Collections.sort() method.\n" +
                                    "\n" +
                                    "\n" +
                                    "53) How do you print Array in Java? (answer)\n" +
                                    "You can print an array by using the Arrays.toString() and Arrays.deepToString() method. Since array doesn't implement toString() by itself, just passing an array to System.out.println() will not print its contents but Arrays.toString() will print each element.\n" +
                                    "\n" +
                                    "54) LinkedList in Java is doubly or singly linked list? (answer)\n" +
                                    "It's a doubly linked list, you can check the code in JDK. In Eclipse, you can use the shortcut, Ctrl + T to directly open this class in Editor.\n" +
                                    "\n" +
                                    "55) Which kind of tree is used to implement TreeMap in Java? (answer)\n" +
                                    "A Red Black tree is used to implement TreeMap in Java.\n" +
                                    "\n" +
                                    "\n" +
                                    "56) Difference between Hashtable and HashMap? (answer)\n" +
                                    "There are many differences between these two classes, some of them are following:\n" +
                                    "a) Hashtable is a legacy class and present from JDK 1, HashMap was added later.\n" +
                                    "b) Hashtable is synchronized and slower but HashMap is not synchronized and faster.\n" +
                                    "c) Hashtable doesn't allow null keys but HashMap allows one null key.\n" +
                                    "See the answer for more differences between HashMap and Hashtable in Java.\n" +
                                    "\n" +
                                    "\n" +
                                    "57) How HashSet works internally in Java? (answer)\n" +
                                    "HashSet is internally implemented using an HashMap. Since a Map needs key and value, a default value is used for all keys. Similar to HashMap, HashSet doesn't allow duplicate keys and only one null key, I mean you can only store one null object in HashSet.\n" +
                                    "\n" +
                                    "\n" +
                                    "58) Write code to remove elements from ArrayList while iterating? (answer)\n" +
                                    " Key here is to check whether candidate uses ArrayList's remove() or Iterator's remove(). Here is the sample code which uses right way o remove elements from ArrayList while looping over and avoids ConcurrentModificationException.\n" +
                                    "\n" +
                                    "\n" +
                                    "59) Can I write my own container class and use it in the for-each loop?\n" +
                                    "Yes, you can write your own container class. You need to implement the Iterable interface if you want to loop over advanced for loop in Java though. If you implement Collection then you by default get that property.\n" +
                                    "\n" +
                                    "\n" +
                                    "60) What is default size of ArrayList and HashMap in Java? (answer)\n" +
                                    "As of Java 7 now, default size of ArrayList is 10 and default capacity of HashMap is 16, it must be power of 2. Here is code snippet from ArrayList  and HashMap class :\n" +
                                    "// from ArrayList.java JDK 1.7\n" +
                                    "private static final int DEFAULT_CAPACITY = 10;  \n" +
                                    "\n" +
                                    "//from HashMap.java JDK 7\n" +
                                    "static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "61) Is it possible for two unequal objects to have same hashcode?\n" +
                                    "Yes, two unequal objects can have same hashcode thats why collision happen in hashmap.\n" +
                                    "the equal hashcode contract only says that two equal objects must have same hashcode it doesn't say anything about unequal object.\n" +
                                    "\n" +
                                    "62) Can two equal object have different hash code?\n" +
                                    "No, thats not possible according to hash code contract.\n" +
                                    "\n" +
                                    "\n" +
                                    "63) Can we use random numbers in hashcode() method? (answer)\n" +
                                    "No, because hashcode of a object should be always same. See the answer to learn more about things to remember while overriding hashCode() method in Java.\n" +
                                    "\n" +
                                    "\n" +
                                    "64) Difference between Comparator and Comparable in Java? (answer)\n" +
                                    "The Comparable interface is used to define the  natural order of object while comparator is used to define custom order. Comparable can be always one but we can have multiple comparator to define order for objects.\n" +
                                    "\n" +
                                    "65) Why you need to override hashcode, when you override equals in Java? (answer)\n" +
                                    " Because equals have code contract mandates to override equals and hashcode together .since many container class like HashMap or HashSet depends on hashcode and equals contract.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Java IO and NIO Interview questions\n" +
                                    "\n" +
                                    "IO is very important from Java interview point of view. You should have a good knowledge of old Java IO, NIO and NIO2 alsong with soms operating system and disk IO fundamentals. Here are some freqeuntly asked questions form Java IO.\n" +
                                    "\n" +
                                    "66) In my Java program, I have three sockets? How many threads I will need to handle that?\n" +
                                    "\n" +
                                    "67) How do you create ByteBuffer in Java?\n" +
                                    "\n" +
                                    "68) How do you write and read from ByteBuffer in Java?\n" +
                                    "\n" +
                                    "69) Is Java BIG endian or LITTLE endian?\n" +
                                    "\n" +
                                    "70) What is the byte order of ByteBuffer?\n" +
                                    "\n" +
                                    "71) The difference between direct buffer and non-direct buffer in Java? (answer)\n" +
                                    "\n" +
                                    "72) What is the memory mapped buffer in Java? (answer)\n" +
                                    "\n" +
                                    "73) What is TCP NO DELAY socket option?\n" +
                                    "\n" +
                                    "74) What is difference between TCP and UDP protocol? (answer)\n" +
                                    "\n" +
                                    "75) The difference between ByteBuffer and StringBuffer in Java? (answer)\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Java Best Practices Interview question\n" +
                                    "\n" +
                                    "Contains best practices from different parts of Java programming e.g. Collections, String, IO, Multi-threading, Error and Exception handling, design patterns etc.\n" +
                                    "\n" +
                                    "76) What best practices you follow while writing multi-threaded code in Java? (answer)\n" +
                                    "Here are couple of best practices which I follow while writing concurrent code in Java:\n" +
                                    "a) Always name your thread, this will help in debugging.\n" +
                                    "b) minimize the scope of synchronization, instead of making whole method synchronized, only critical section should be synchronized.\n" +
                                    "c) prefer volatile over synchronized if you can can.\n" +
                                    "e) use higher level concurrency utilities instead of waitn() and notify for inter thread communication e.g. BlockingQueue, CountDownLatch and Semeaphore.\n" +
                                    "e) Prefer concurrent collection over synchronized collection in Java. They provide better scalability.\n" +
                                    "\n" +
                                    "\n" +
                                    "77) Tell me few best practices you apply while using Collections in Java? (answer)\n" +
                                    "Here are couple of best practices I follow while using Collectionc classes from Java:\n" +
                                    "a) Always use the right collection e.g. if you need non-synchronized list then use ArrayList and not Vector.\n" +
                                    "b) Prefer concurrent collection over synchronized collection because they are more scalable.\n" +
                                    "c) Alwayuse use interface to reprsent and access a collection e.g. use List to store ArrayList, Map to store HashMap and so on.\n" +
                                    "d) Use iterator to loop over collection.\n" +
                                    "e) Always use generics with collection.\n" +
                                    "\n" +
                                    "\n" +
                                    "78) Can you tell us at least 5 best practice you use while using threads in Java? (answer)\n" +
                                    "This is similar to previous question and you can use the answer given there. Particularly with thread, you should:\n" +
                                    "a) name your thread\n" +
                                    "b) keep your task and thread separate, use Runnable or Callable with thread pool executor.\n" +
                                    "c) use thread pool\n" +
                                    "\n" +
                                    "\n" +
                                    "79) Name 5 IO best practices? (answer)\n" +
                                    "IO is very important for performance of your Java application. Ideally you should avoid IO in critical path of your application. Here are couple of Java IO best practices you can follow:\n" +
                                    "a) Use buffered IO classes instead of reading individual bytes and char.\n" +
                                    "b) Use classes from NIO and NIO2\n" +
                                    "c) Always close streams in finally block or use try-with-resource statements.\n" +
                                    "d) use memory mapped file for faster IO.\n" +
                                    "\n" +
                                    "\n" +
                                    "80) Name 5 JDBC best practices your follow? (answer)\n" +
                                    "There are many best practices and you can name as per your confort and conviniece. Here are some of the more common ones:\n" +
                                    "a) use batch statement for inserting and updating data.\n" +
                                    "b) use PreparedStatement to avoid SQL exception and better performance.\n" +
                                    "c) use database connection pool\n" +
                                    "d) access resultset using column name instead of column indexes.\n" +
                                    "e) Don't generate dynamic SQL by concatenating String with user input.\n" +
                                    "\n" +
                                    "\n" +
                                    "81) Name couple of method overloading best practices in Java? (answer)\n" +
                                    "Here are some best practices you can follow while overloading a method in Java to avoid confusion with auto-boxing:\n" +
                                    "a) Don't overload method where one accepts int and other accepts Integer.\n" +
                                    "b) Don't overload method where number of argument is same and only order of argument is different.\n" +
                                    "c) Use varargs after overloaded methods has more than 5 arguments.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Date, Time and Calendar Interview questions in Java\n" +
                                    "\n" +
                                    "\n" +
                                    "82) Does SimpleDateFormat is safe to use in the multi-threaded program? (answer)\n" +
                                    "No, unfortunately, DateFormat and all its implementations including SimpleDateFormat is not thread-safe, hence should not be used in the multi-threaded program until external thread-safety measures are applied e.g. confining SimpleDateFormat object into a ThreadLocal variable. If you don't do that, you will get an incorrect result while parsing or formatting dates in Java. Though, for all practical date time purpose, I highly recommend joda-time library.\n" +
                                    "\n" +
                                    "\n" +
                                    "83) How do you format a date in Java? e.g. in the ddMMyyyy format? (answer)\n" +
                                    "You can either use SimpleDateFormat class or joda-time library to format date in Java. DateFormat class allows you to format date on many popular formats. Please see the answer for code samples to format date into different formats e.g. dd-MM-yyyy or ddMMyyyy.\n" +
                                    "\n" +
                                    "\n" +
                                    "84) How do you show timezone in formatted date in Java? (answer)\n" +
                                    "\n" +
                                    "85) The difference between java.util.Date and java.sql.Date in Java? (answer)\n" +
                                    "\n" +
                                    "86) How to you calculate the difference between two dates in Java? (program)\n" +
                                    "\n" +
                                    "87) How do you convert a String(YYYYMMDD) to date in Java? (answer)\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Unit testing JUnit Interview questions\n" +
                                    "\n" +
                                    "89) How do you test static method? (answer)\n" +
                                    "You can use PowerMock library to test static methods in Java.\n" +
                                    "\n" +
                                    "90) How to do you test a method for exception using JUnit? (answer)\n" +
                                    "\n" +
                                    "91) Which unit testing libraries you have used for testing Java programs? (answer)\n" +
                                    "\n" +
                                    "92) Difference between @Before and @BeforeClass annotation? (answer)\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Programming and Coding Questions\n" +
                                    "\n" +
                                    "93) How to check if a String contains only numeric digits? (solution)\n" +
                                    "\n" +
                                    "94) How to write LRU cache in Java using Generics? (answer)\n" +
                                    "\n" +
                                    "95) Write a Java program to convert bytes to long? (answer)\n" +
                                    "\n" +
                                    "96) How to reverse a String in Java without using StringBuffer? (solution)\n" +
                                    "\n" +
                                    "97) How to find the word with highest frequency from a file in Java? (solution)\n" +
                                    "\n" +
                                    "98) How do you check if two given String are anagrams? (solution)\n" +
                                    "\n" +
                                    "99) How to print all permutation of a String in Java? (solution)\n" +
                                    "\n" +
                                    "100) How do you print duplicate elements from an array in Java? (solution)\n" +
                                    "\n" +
                                    "101) How to convert String to int in Java? (solution)\n" +
                                    "\n" +
                                    "102) How to swap two integers without using temp variable? (solution)\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Java Interview questions from OOP and Design Patterns\n" +
                                    "\n" +
                                    "It contains Java Interview questions from SOLID design principles, OOP fundamentals e.g. class, object, interface, Inheritance, Polymorphism, Encapsulation, and Abstraction as well as more advanced concepts like Composition, Aggregation, and Association. It also contains questions from GOF design patterns.\n" +
                                    "\n" +
                                    "103) What is the interface? Why you use it if you cannot write anything concrete on it?\n" +
                                    "The interface is used to define API. It tells about the contract your classes will follow. It also supports abstraction because a client can use interface method to leverage multiple implementations e.g. by using List interface you can take advantage of random access of ArrayList as well as flexible insertion and deletion of LinkedList. The interface doesn't allow you to write code to keep things abstract but from Java 8 you can declare static and default methods inside interface which are concrete.\n" +
                                    "\n" +
                                    "\n" +
                                    "104) The difference between abstract class and interface in Java? (answer)\n" +
                                    "There are multiple differences between abstract class and interface in Java, but the most important one is Java's restriction on allowing a class to extend just one class but allows it to implement multiple interfaces. An abstract class is good to define default behavior for a family of class, but the interface is good to define Type which is later used to leverage Polymorphism. Please check the answer for more through discussion in this question.\n" +
                                    "\n" +
                                    "\n" +
                                    "105) Which design pattern have you used in your production code? apart from Singleton?\n" +
                                    "This is something you can answer from your experience. You can generally say about dependency injection, factory pattern, decorator pattern or observer pattern, whichever you have used. Though be prepared to answer follow-up question based upon the pattern you choose.\n" +
                                    "\n" +
                                    "\n" +
                                    "106) Can you explain Liskov Substitution principle? (answer)\n" +
                                    "\n" +
                                    "\n" +
                                    "107) What is Law of Demeter violation? Why it matters? (answer)\n" +
                                    "Law of Demeter suggests you \"talk to friends and not stranger\", hence used to reduce coupling between classes.\n" +
                                    "\n" +
                                    "108) What is Adapter pattern? When to use it?\n" +
                                    "It provides interface conversion. If your client is using some interface but you have something else, you can write an Adapter to bridge them together.\n" +
                                    "\n" +
                                    "109) What is \"dependency injection\" and \"inversion of control\"? Why would someone use it? (answer)\n" +
                                    "\n" +
                                    "110) What is an abstract class? How is it different from an interface? Why would you use it? (answer)\n" +
                                    "\n" +
                                    "111) Which one is better constructor injection or setter dependency injection? (answer)\n" +
                                    "Each has their own advantage and disadvantage. Constructor injection guaranteed that class will be initialized with all its dependency, but setter injection provides flexibility to set an optional dependency. Setter injection is also more readable if you are using an XML file to describe dependency. Rule of thumb is to use constructor injection for mandatory dependency and use setter injection for optional dependency.\n" +
                                    "\n" +
                                    "\n" +
                                    "112) What is difference between dependency injection and factory design pattern? (answer)\n" +
                                    "Though both patterns help to take out object creation part from application logic, use of dependency injection results in cleaner code than factory pattern. By using dependency injection, your classes are nothing but POJO which only knows about dependency but doesn't care how they are acquired. In the case of factory pattern, the class also needs to know about factory to acquire dependency. hence, DI results in more testable classes than factory pattern. Please see the answer for a more detailed discussion on this topic.\n" +
                                    "\n" +
                                    "\n" +
                                    "113) Difference between Adapter and Decorator pattern? (answer)\n" +
                                    "Though the structure of Adapter and Decorator pattern is similar, the difference comes on the intent of each pattern. The adapter pattern is used to bridge the gap between two interfaces, but Decorator pattern is used to add new functionality into the class without the modifying existing code.\n" +
                                    "\n" +
                                    "\n" +
                                    "114) Difference between Adapter and Proxy Pattern? (answer)\n" +
                                    "Similar to the previous question, the difference between Adapter and Proxy patterns is in their intent. Since both Adapter and Proxy pattern encapsulate the class which actually does the job, hence result in the same structure, but Adapter pattern is used for interface conversion while the Proxy pattern is used to add an extra level of indirection to support distribute, controlled or intelligent access.\n" +
                                    "\n" +
                                    "\n" +
                                    "115) What is Template method pattern? (answer)\n" +
                                    "Template pattern provides an outline of an algorithm and lets you configure or customize its steps. For examples, you can view a sorting algorithm as a template to sort object. It defines steps for sorting but let you configure how to compare them using Comparable or something similar in another language. The method which outlines the algorithms is also known as template method.\n" +
                                    "\n" +
                                    "\n" +
                                    "116) When do you use Visitor design pattern? (answer)\n" +
                                    "The visitor pattern is a solution of problem where you need to add operation on a class hierarchy but without touching them. This pattern uses double dispatch to add another level of indirection.\n" +
                                    "\n" +
                                    "\n" +
                                    "117) When do you use Composite design pattern? (answer)\n" +
                                    "Composite design pattern arranges objects into tree structures to represent part-whole hierarchies. It allows clients treat individual objects and container of objects uniformly. Use Composite pattern when you want to represent part-whole hierarchies of objects.\n" +
                                    "\n" +
                                    "\n" +
                                    "118) The difference between Inheritance and Composition? (answer)\n" +
                                    "Though both allows code reuse, Composition is more flexible than Inheritance because it allows you to switch to another implementation at run-time. Code written using Composition is also easier to test than code involving inheritance hierarchies.\n" +
                                    "\n" +
                                    "\n" +
                                    "119) Describe overloading and overriding in Java? (answer)\n" +
                                    "Both overloading and overriding allow you to write two methods of different functionality but with the same name, but overloading is compile time activity while overriding is run-time activity. Though, you can overload a method in the same class, but you can only override a method in child classes. Inheritance is necessary for overriding.\n" +
                                    "\n" +
                                    "\n" +
                                    "120) The difference between nested public static class and a top level class in Java? (answer)\n" +
                                    "You can have more than one nested public static class inside one class, but you can only have one top-level public class in a Java source file and its name must be same as the name of Java source file.\n" +
                                    "\n" +
                                    "\n" +
                                    "121) Difference between Composition, Aggregation and Association in OOP? (answer)\n" +
                                    "If two objects are related to each other, they are said to be associated with each other. Composition and Aggregation are two forms of association in object-oriented programming. The composition is stronger association than Aggregation. In Composition, one object is OWNER of another object while in Aggregation one object is just USER of another object. If an object A is composed of object B then B doesn't exist if A ceased to exists, but if object A is just an aggregation of object B then B can exists even if A ceased to exist.\n" +
                                    "\n" +
                                    "\n" +
                                    "122) Give me an example of design pattern which is based upon open closed principle? (answer)\n" +
                                    "Open closed design principle asserts that your code should be open for extension but closed for modification. Which means if you want to add new functionality, you can add it easily using the new code but without touching already tried and tested code. There are several design patterns which are based upon open closed design principle e.g. Strategy if you need a new strategy, just implement the interface and configure, no need to modify core logic. One working example is Collections.sort() method which is based upon Strategy pattern and follows the open-closed principle, you don't modify sort() method to sort a new object, what you do is just implement Comparator in your own way.\n" +
                                    "\n" +
                                    "\n" +
                                    "123) Difference between Abstract factory and Prototype design pattern? (answer)\n" +
                                    "\n" +
                                    "\n" +
                                    "124) When do you use Flyweight pattern? (answer)\n" +
                                    "Flyweight pattern allows you to share object to support large numbers without actually creating too many objects. In order to use Flyweight pattern, you need to make your object Immutable so that they can be safely shared. String pool and pool of Integer and Long object in JDK are good examples of Flyweight pattern.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Miscellaneous Java Interview Questions\n" +
                                    "\n" +
                                    "It contains XML Processing in Java Interview question, JDBC Interview question, Regular expressions Interview questions, Java Error and Exception Interview Questions, Serialization,\n" +
                                    "\n" +
                                    "125) The difference between nested static class and top level class? (answer)\n" +
                                    "A public top level class must have the same name as the name of the source file, there is no such requirement for nested static class. A nested class is always inside a top level class and you need to use the name of the top-level class to refer nested static class e.g. HashMap.Entry is a nested static class, where HashMap is a top level class and Entry is nested static class.\n" +
                                    "\n" +
                                    "\n" +
                                    "126) Can you write a regular expression to check if String is a number? (solution)\n" +
                                    "A numeric String can only contain digits i.e. 0 to 9 and + and - sign that too at start of the String, by using this information you can write following regular expression to check if given String is number or not\n" +
                                    "\n" +
                                    "\n" +
                                    "127) The difference between checked and unchecked Exception in Java? (answer)\n" +
                                    "checked exception is checked by the compiler at compile time. It's mandatory for a method to either handle the checked exception or declare them in their throws clause. These are the ones which are a sub class of Exception but doesn't descend from RuntimeException. The unchecked exception is descendant of RuntimeException and not checked by the compiler at compile time.\n" +
                                    "\n" +
                                    "\n" +
                                    "128) The difference between throw and throws in Java? (answer)\n" +
                                    "throw is used to actually throw an instance of java.lang.Throwable class, which means you can throw both Error and Exception using throw keyword e.g.\n" +
                                    "\n" +
                                    "throw new IllegalArgumentException(\"size must be multiple of 2\")\n" +
                                    "\n" +
                                    "On the other hand, throws is used as part of method declaration and signals which kind of exceptions are thrown by this method so that its caller can handle them. It's mandatory to declare any unhandled checked exception in throws clause in Java.\n" +
                                    "\n" +
                                    "\n" +
                                    "129) The difference between Serializable and Externalizable in Java? (answer)\n" +
                                    "Serializable interface is used to make Java classes serializable so that they can be transferred over network or their state can be saved on disk, but it leverages default serialization built-in JVM, which is expensive, fragile and not secure. Externalizable allows you to fully control the Serialization process, specify a custom binary format and add more security measure.\n" +
                                    "\n" +
                                    "\n" +
                                    "130) The difference between DOM and SAX parser in Java? (answer)\n" +
                                    "DOM parser loads the whole XML into memory to create a tree based DOM model which helps it quickly locate nodes and make a change on the structure of XML while SAX parser is an event based parser and doesn't load the whole XML into memory. Due to this reason DOM is faster than SAX but require more memory and not suitable to parse large XML files.\n" +
                                    "\n" +
                                    "\n" +
                                    "131) Tell me 3 features introduced on JDK 1.7? (answer)\n" +
                                    "Though JDK 7 was not a big bang release like JDK 5 or JDK 8, it still has a lot of good feature to count on e.g. try-with-resource statements, which free you from closing streams and resources when you are done with that, Java automatically closes that. Fork-Join pool to implement something like the Map-reduce pattern in Java. Allowing String variable and literal into switch statements. Diamond operator for improved type inference, no need to declare generic type on the right-hand side of variable declaration anymore, results in more readable and succinct code. Another worth noting feature introduced was improved exception handling e.g. allowing you to catch multiple exceptions in the same catch block.\n" +
                                    "\n" +
                                    "\n" +
                                    "132) Tell me 5 features introduced on JDK 1.8? (answer)\n" +
                                    "Java 8 is path breaking release in Java's history, here are the top 5 features from JDK 8 release\n" +
                                    "Lambda expression, which allows you pass an anonymous function like object.\n" +
                                    "Stream API, take advantage of multiple cores of modern CPU and allows you to write succinct code.\n" +
                                    "Date and Time API, finally you have a solid and easy to use date and time library right into JDK\n" +
                                    "Extension methods, now you can have static and default method into your interface\n" +
                                    "Repeated annotation, allows you apply the same annotation multiple times on a type\n" +
                                    "\n" +
                                    "133) What is the difference between Maven and ANT in Java? (answer)\n" +
                                    "Though both are build tool and used to create Java application build, Maven is much more than that. It provides standard structure for Java project based upon \"convention over configuration\" concept and automatically manage dependencies (JAR files on which your application is dependent) for Java application. Please see the answer for more differences between Maven and ANT tool.\n" +
                                    "\n" +

                                    "\n";
                            String site2 = "JAVA";

                            Intent intent = new Intent(v.getContext(), CSS.class);
                            intent.putExtra(SITE1_KEY, site1);
                            intent.putExtra(SITE2_KEY, site2);
                            startActivity(intent);
                    }
            });

            phpa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            Toast.makeText(getBaseContext(), "Processing", Toast.LENGTH_SHORT).show();

                            String site1 = "PHP Interview Questions\n" +
                                    "\n" +
                                    "1) What is PHP?\n" +
                                    "\n" +
                                    "PHP is a web language based on scripts that allows developers to dynamically create generated web pages.\n" +
                                    "\n" +
                                    "2) What does the initials of PHP stand for?\n" +
                                    "\n" +
                                    "PHP means PHP: Hypertext Preprocessor.\n" +
                                    "\n" +
                                    "3) Which programming language does PHP resemble to?\n" +
                                    "\n" +
                                    "PHP syntax resembles Perl and C\n" +
                                    "\n" +
                                    "4) What does PEAR stands for?\n" +
                                    "\n" +
                                    "PEAR means \"PHP Extension and Application Repository\". it extends PHP and provides a higher level of programming for web developers.\n" +
                                    "\n" +
                                    "5) What is the actually used PHP version?\n" +
                                    "\n" +
                                    "Version 5 is the actually used version of PHP.\n" +
                                    "\n" +
                                    "6) How do you execute a PHP script from the command line?\n" +
                                    "\n" +
                                    "Just use the PHP command line interface (CLI) and specify the file name of the script to be executed as follows: [crayon-54f5a6ec5efdf844332573/]\n" +
                                    "\n" +
                                    "7) How to run the interactive PHP shell from the command line interface?\n" +
                                    "\n" +
                                    "Just use the PHP CLI program with the option -a as follows: [crayon-54f5a6ec5efe6033385547/]\n" +
                                    "\n" +
                                    "8) What are the correct and the most two common way to start and finish a PHP block of code?\n" +
                                    "\n" +
                                    "The two most  common ways to start and finish a PHP script are:  and\n" +
                                    "\n" +
                                    "9) How can we display the output directly to the browser?\n" +
                                    "\n" +
                                    "To be able to display the output directly to the browser, we have to use the special tags .\n" +
                                    "\n" +
                                    "10) What is the main difference between PHP 4 and PHP 5?\n" +
                                    "\n" +
                                    "PHP 5 presents many additional OOP (Object Oriented Programming) features.\n" +
                                    "\n" +
                                    "11) Is multiple inheritance supported in PHP?\n" +
                                    "\n" +
                                    "PHP includes only single inheritance, it means that a class can be extended from only one single class using the keyword 'extended'.\n" +
                                    "\n" +
                                    "12) What is the meaning of a final class and a final method?\n" +
                                    "\n" +
                                    "'final' is introduced in PHP5. Final class means that this class cannot be extended and a final method cannot be overrided.\n" +
                                    "\n" +
                                    "13) How comparison of objects is done in PHP5?\n" +
                                    "\n" +
                                    "We use the operator '==' to test is two object are instanced from the same class and have same attributes and equal values. We can test if two object are refering to the same instance of the same class by the use of the identity operator '==='.\n" +
                                    "\n" +
                                    "14) How can PHP and HTML interact?\n" +
                                    "\n" +
                                    "It is possible to generate HTML through PHP scripts, and it is possible to pass informations from HTML to PHP.\n" +
                                    "\n" +
                                    "15) What type of operation is needed when passing values through a form or an URL?\n" +
                                    "\n" +
                                    "If we would like to pass values througn a form or an URL then we need to encode and to decode them using htmlspecialchars() and urlencode().\n" +
                                    "\n" +
                                    "16) How can PHP and Javascript interact?\n" +
                                    "\n" +
                                    "PHP and Javascript cannot directly interacts since PHP is a server side language and Javascript is a client side language. However we can exchange variables since PHP is able to generate Javascript code to be executed by the browser and it is possible to pass specific variables back to PHP via the URL.\n" +
                                    "\n" +
                                    "17) What is needed to be able to use image function?\n" +
                                    "\n" +
                                    "GD library is needed to be able execute image functions.\n" +
                                    "\n" +
                                    "18) What is the use of the function 'imagetypes()'?\n" +
                                    "\n" +
                                    "imagetypes() gives the image format and types supported by the current version of GD-PHP.\n" +
                                    "\n" +
                                    "19) What are the functions to be used to get the image's properties (size, width and height)?\n" +
                                    "\n" +
                                    "The functions are getimagesize() for size, imagesx() for width and imagesy() for height.\n" +
                                    "\n" +
                                    "20) How failures in execution are handled with include() and require() functions?\n" +
                                    "\n" +
                                    "If the function require() cannot access to the file then it ends with a fatal error. However, the include() function gives a warning and the PHP script continues to execute.\n" +
                                    "\n" +
                                    "21) What is the main difference between require() and require_once()?\n" +
                                    "\n" +
                                    "require() and require_once() perform the same task except that the second function checks if the PHP script is already included or not before executing it.\n" +
                                    "\n" +
                                    "(same for include_once() and include())\n" +
                                    "\n" +
                                    "22) How can I display text with a PHP script?\n" +
                                    "\n" +
                                    "Two methods are possible: [crayon-54f5a6ec5efeb454671428/]\n" +
                                    "\n" +
                                    "23) How can we display information of a variable and readable by human with PHP?\n" +
                                    "\n" +
                                    "To be able to display a human-readable result we use print_r().\n" +
                                    "\n" +
                                    "24) How is it possible to set an infinite execution time for PHP script?\n" +
                                    "\n" +
                                    "The set_time_limit(0) added at the beginning of a script sets to infinite the time of execution to not have the PHP error 'maximum execution time exceeded'.It is also possible to specify this in the php.ini file.\n" +
                                    "\n" +
                                    " 25) What does the PHP error 'Parse error in PHP - unexpected T_variable at line x' means?\n" +
                                    "\n" +
                                    "This is a PHP syntax error expressing that a mistake at the line x stops parsing and executing the program.\n" +
                                    "\n" +
                                    "26) What should we do to be able to export data into an Excel file?\n" +
                                    "\n" +
                                    "The most common and used way is to get data into a format supported by Excel. For example, it is possible to write a .csv file, to choose for example comma as separator between fields and then to open the file with Excel.\n" +
                                    "\n" +
                                    "27) What is the function file_get_contents() usefull for?\n" +
                                    "\n" +
                                    "file_get_contents() lets reading a file and storing it in a string variable.\n" +
                                    "\n" +
                                    "28) How can we connect to a MySQL database from a PHP script?\n" +
                                    "\n" +
                                    "To be able to connect to a MySQL database, we must use mysql_connect() function as follows: [crayon-54f5a6ec5efef650104056/] 29) What is the function mysql_pconnect() usefull for?\n" +
                                    "\n" +
                                    "mysql_pconnect() ensure a persistent connection to the database, it means that the connection do not close when the the PHP script ends.\n" +
                                    "\n" +
                                    "30) How the result set of Mysql be handled in PHP?\n" +
                                    "\n" +
                                    "The result set can be handled using mysql_fetch_array, mysql_fetch_assoc, mysql_fetch_object or mysql_fetch_row.\n" +
                                    "\n" +
                                    "31) How is it possible to know the number of rows returned in result set?\n" +
                                    "\n" +
                                    "The function mysql_num_rows() returns the number of rows in a result set.\n" +
                                    "\n" +
                                    "32) Which function gives us the number of affected entries by a query?\n" +
                                    "\n" +
                                    "mysql_affected_rows() return the number of entries affected by an SQL query.\n" +
                                    "\n" +
                                    "33) What is the difference between mysql_fetch_object() and mysql_fetch_array()?\n" +
                                    "\n" +
                                    "The mysql_fetch_object() function collects the first single matching record where mysql_fetch_array() collects all matching records from the table in an array.\n" +
                                    "\n" +
                                    "34) How can we access the data sent through the URL with the GET method?\n" +
                                    "\n" +
                                    "In order to access the data sent via the GET method, we you use $_GET array like this:\n" +
                                    "\n" +
                                    "www.url.com?var=value $variable = $_GET[\"var\"]; this will now contain 'value'\n" +
                                    "\n" +
                                    "35) How can we access the data sent through the URL with the POST method?\n" +
                                    "\n" +
                                    "To access the data sent this way, you use the $_POST array.\n" +
                                    "\n" +
                                    "Imagine you have a form field called 'var' on the form, when the user clicks submit to the post form, you can then access the value like this:\n" +
                                    "\n" +
                                    "$_POST[\"var\"];\n" +
                                    "\n" +
                                    "36) How can we check the value of a given variable is a number?\n" +
                                    "\n" +
                                    "It is possible to use the dedicated function, is_numeric() to check whether it is a number or not.\n" +
                                    "\n" +
                                    "37) How can we check the value of a given variable is alphanumeric?\n" +
                                    "\n" +
                                    "It is possible to use the dedicated function, ctype_alnum to check whether it is an alphanumeric value or not.\n" +
                                    "\n" +
                                    "38) How do I check if a given variable is empty?\n" +
                                    "\n" +
                                    "If we want to check whether a variable has a value or not, it is possible to use the empty() function.\n" +
                                    "\n" +
                                    "39) What does the unlink() function means?\n" +
                                    "\n" +
                                    "The unlink() function is dedicated for file system handling. It simply deletes the file given as entry.\n" +
                                    "\n" +
                                    "40) What does the unset() function means?\n" +
                                    "\n" +
                                    "The unset() function is dedicated for variable management. It will make a variable undefined.\n" +
                                    "\n" +
                                    "41) How do I escape data before storing it into the database?\n" +
                                    "\n" +
                                    "addslashes function enables us to escape data before storage into the database.\n" +
                                    "\n" +
                                    "42) How is it possible to remove escape characters from a string?\n" +
                                    "\n" +
                                    "The stripslashes function enables us to remove the escape characters before apostrophes in a string.\n" +
                                    "\n" +
                                    "43) How can we automatically escape incoming data?\n" +
                                    "\n" +
                                    "We have to enable the Magic quotes entry in the configuration file of PHP.\n" +
                                    "\n" +
                                    "44) What does the function get_magic_quotes_gpc() means?\n" +
                                    "\n" +
                                    "The function get_magic_quotes_gpc() tells us whether the magic quotes is switched on or no.\n" +
                                    "\n" +
                                    "45) Is it possible to remove the HTML tags from data?\n" +
                                    "\n" +
                                    "The strip_tags() function enables us to clean a string from the HTML tags.\n" +
                                    "\n" +
                                    "46) what is the static variable in function useful for?\n" +
                                    "\n" +
                                    "A static variable is defined within a function only the first time and its value can be modified during function calls as follows: [crayon-54f5a6ec5eff3292343611/]\n" +
                                    "\n" +
                                    "47) How can we define a variable accessible in functions of a PHP script?\n" +
                                    "\n" +
                                    "This feature is possible using the global keyword.\n" +
                                    "\n" +
                                    "48) How is it possible to return a value from a function?\n" +
                                    "\n" +
                                    "A function returns a value using the instruction 'return $value;'.\n" +
                                    "\n" +
                                    "49) What is the most convenient hashing method to be used to hash passwords?\n" +
                                    "\n" +
                                    "It is preferable to use crypt() which natively supports several hashing algorithms or the function hash() which supports more variants than crypt() rather than using the common hashing algorithms such as md5, sha1 or sha256 because they are conceived to be fast. hence, hashing passwords with these algorithms can vulnerability.\n" +
                                    "\n" +
                                    "50) Which cryptographic extension provide generation and verification of digital signatures?\n" +
                                    "\n" +
                                    "The PHP-openssl extension provides several cryptographic operations including generation and verification of digital signatures.\n" +
                                    "\n" +
                                    "51) How a constant is defined in a PHP script?\n" +
                                    "\n" +
                                    "The define() directive lets us defining a constant as follows:\n" +
                                    "\n" +
                                    "define (\"ACONSTANT\", 123);\n" +
                                    "\n" +
                                    "52) How can you pass a variable by reference?\n" +
                                    "\n" +
                                    "To be able to pass a variable by reference, we use an ampersand in front of it, as follows $var1 = &$var2\n" +
                                    "\n" +
                                    "53) Will a comparison of an integer 12 and a string \"13\" work in PHP?\n" +
                                    "\n" +
                                    "\"13\" and 12 can be compared in PHP since it casts everything to the integer type.\n" +
                                    "\n" +
                                    "54) How is it possible to cast types in PHP?\n" +
                                    "\n" +
                                    "The name of the output type have to be specified in parentheses before the variable which is to be cast as follows:\n" +
                                    "\n" +
                                    "* (int), (integer) - cast to integer\n" +
                                    "\n" +
                                    "* (bool), (boolean) - cast to boolean\n" +
                                    "\n" +
                                    "* (float), (double), (real) - cast to float\n" +
                                    "\n" +
                                    "* (string) - cast to string\n" +
                                    "\n" +
                                    "* (array) - cast to array\n" +
                                    "\n" +
                                    "* (object) - cast to object\n" +
                                    "\n" +
                                    "55) When a conditional statement is ended with an endif?\n" +
                                    "\n" +
                                    "When the original if was followed by : and then the code block without braces.\n" +
                                    "\n" +
                                    "56) How is the ternary conditional operator used in PHP?\n" +
                                    "\n" +
                                    "It is composed of three expressions: a condition, and two operands describing what instruction should be performed when the specified condition is true or false as follows:\n" +
                                    "\n" +
                                    "Expression_1 ? Expression_2 : Expression_3;\n" +
                                    "\n" +
                                    "57) What is the function func_num_args() used for?\n" +
                                    "\n" +
                                    "The function func_num_args() is used to give the number of parameters passed into a function.\n" +
                                    "\n" +
                                    "58) If the variable $var1 is set to 10 and the $var2 is set to the character var1, what's the value of $$var2?\n" +
                                    "\n" +
                                    "$$var2 contains the value 10.\n" +
                                    "\n" +
                                    "59) What does accessing a class via :: means?\n" +
                                    "\n" +
                                    ":: is used to access static methods that do not require object initialization.\n" +
                                    "\n" +
                                    "60) In PHP, objects are they passed by value or by reference?\n" +
                                    "\n" +
                                    "In PHP, objects passed by value.\n" +
                                    "\n" +
                                    "61) Are Parent constructors called implicitly inside a class constructor?\n" +
                                    "\n" +
                                    "No, a parent constructor have to be called explicitly as follows:\n" +
                                    "\n" +
                                    "parent::constructor($value)\n" +
                                    "\n" +
                                    "62) What's the difference between __sleep and __wakeup?\n" +
                                    "\n" +
                                    "__sleep returns the array of all the variables that need to be saved, while __wakeup retrieves them.\n" +
                                    "\n" +
                                    "63) What is faster?\n" +
                                    "\n" +
                                    "1- Combining two variables as follows:\n" +
                                    "\n" +
                                    "$variable1 = 'Hello ';\n" +
                                    "\n" +
                                    "$variable2 = 'World';\n" +
                                    "\n" +
                                    "$variable3 = $variable1.$variable2;\n" +
                                    "\n" +
                                    "Or\n" +
                                    "\n" +
                                    "2- $variable3 = \"$variable1$variable2\";\n" +
                                    "\n" +
                                    "$variable3 will contain \"Hello World\". The first code is faster than the second code especially for large large sets of data.\n" +
                                    "\n" +
                                    "64) what is the definition of a session?\n" +
                                    "\n" +
                                    "A session is a logical object enabling us to preserve temporary data across multiple PHP pages.\n" +
                                    "\n" +
                                    "65) How to initiate a session in PHP?\n" +
                                    "\n" +
                                    "The use of the function session_start() lets us activating a session.\n" +
                                    "\n" +
                                    "66) How is it possible to propagate a session id?\n" +
                                    "\n" +
                                    "It is possible to propagate a session id via cookies or URL parameters.\n" +
                                    "\n" +
                                    "67) What is the meaning of a Persistent Cookie?\n" +
                                    "\n" +
                                    "A persistent cookie is permanently stored in a cookie file on the browser's computer. By default, cookies are temporary and are erased if we close the browser.\n" +
                                    "\n" +
                                    "68) When sessions ends?\n" +
                                    "\n" +
                                    "Sessions automatically ends when the PHP script finishs executing, but can be manually ended\n" +
                                    "\n" +
                                    "using the session_write_close().\n" +
                                    "\n" +
                                    "69) What is the difference between session_unregister() and session_unset()?\n" +
                                    "\n" +
                                    "The session_unregister() function unregister a global variable from the current session and the session_unset() function free all session variables.\n" +
                                    "\n" +
                                    "70) What does $GLOBALS means?\n" +
                                    "\n" +
                                    "$GLOBALS is associative array including references to all variables which are currently defined in the global scope of the script.\n" +
                                    "\n" +
                                    "71) What does $_SERVER means?\n" +
                                    "\n" +
                                    "$_SERVER is an array including information created by the web server such as paths, headers, and script locations.\n" +
                                    "\n" +
                                    "72) What does $_FILES means?\n" +
                                    "\n" +
                                    "$_FILES is an associative array composed of items sent to the current script via the HTTP POST method.\n" +
                                    "\n" +
                                    "73) What is the difference between $_FILES['userfile']['name'] and $_FILES['userfile']['tmp_name']?\n" +
                                    "\n" +
                                    "$_FILES['userfile']['name'] represents the original name of the file on the client machine,\n" +
                                    "\n" +
                                    "$_FILES['userfile']['tmp_name'] represents the temporary filename of the file stored on the server.\n" +
                                    "\n" +
                                    "74) How can we get the error when there is a problem to upload a file?\n" +
                                    "\n" +
                                    "$_FILES['userfile']['error'] contains the error code associated with the uploaded file.\n" +
                                    "\n" +
                                    "75) How can we change the maximum size of the files to be uploaded?\n" +
                                    "\n" +
                                    "We can change the maximum size of files to be uploaded by changing upload_max_filesize in php.ini.\n" +
                                    "\n" +
                                    "76) What does $_ENV means?\n" +
                                    "\n" +
                                    "$_ENV is an associative array of variables sent to the current PHP script via the environment method.\n" +
                                    "\n" +
                                    "77) What does $_COOKIE means?\n" +
                                    "\n" +
                                    "$_COOKIE is an associative array of variables sent to the current PHP script using the HTTP Cookies.\n" +
                                    "\n" +
                                    "78) What does the scope of variables means?\n" +
                                    "\n" +
                                    "The scope of a variable is the context within which it is defined. For the most part all PHP variables only have a single scope. This single scope spans included and required files as well.\n" +
                                    "\n" +
                                    "79) what the difference between the 'BITWISE AND' operator and the 'LOGICAL AND' operator?\n" +
                                    "\n" +
                                    "$a and $b:    TRUE if both $a and $b are TRUE.\n" +
                                    "\n" +
                                    "$a & $b:        Bits that are set in both $a and $b are set.\n" +
                                    "\n" +
                                    "80) What are the two main string operators?\n" +
                                    "\n" +
                                    "The first is the concatenation operator ('.'), which returns the concatenation of its right and left arguments. The second is ('.='), which appends the argument on the right to the argument on the left.\n" +
                                    "\n" +
                                    "81) What does the array operator '===' means?\n" +
                                    "\n" +
                                    "$a === $b TRUE if $a and $b have the same key/value pairs in the same order and of the same types.\n" +
                                    "\n" +
                                    "82) What is the differences between $a != $b and $a !== $b?\n" +
                                    "\n" +
                                    "!= means inequality (TRUE if $a is not equal to $b) and !== means non-identity (TRUE if $a is not identical to $b).\n" +
                                    "\n" +
                                    "83) How can we determine whether a PHP variable is an instantiated object of a certain class?\n" +
                                    "\n" +
                                    "To be able to verify whether a PHP variable is an instantiated object of a certain class we use instanceof.\n" +
                                    "\n" +
                                    "84) What is the goto statement useful for?\n" +
                                    "\n" +
                                    "The goto statement can be placed to enable jumping inside the PHP program. The target is pointed by a label followed by a colon, and the instruction is specified as a goto statement followed by the desired target label.\n" +
                                    "\n" +
                                    "85) what is the difference between  Exception::getMessage and Exception::getLine ?\n" +
                                    "\n" +
                                    "Exception::getMessage lets us getting the Exception message and Exception::getLine lets us\n" +
                                    "\n" +
                                    "getting the line in which the exception occurred.\n" +
                                    "\n" +
                                    "86) What does the expression Exception::__toString means?\n" +
                                    "\n" +
                                    "Exception::__toString gives the String representation of the exception.\n" +
                                    "\n" +
                                    "87) How is it possible to parse a configuration file?\n" +
                                    "\n" +
                                    "The function parse_ini_file() enables us to load in the ini file specified in filename, and returns the settings in it in an associative array.\n" +
                                    "\n" +
                                    "88) How can we determine whether a variable is set?\n" +
                                    "\n" +
                                    "The boolean function isset determines if a variable is set and is not NULL.\n" +
                                    "\n" +
                                    "89) What is the difference between the functions strstr() and stristr()?\n" +
                                    "\n" +
                                    "The string function strstr(string allString, string occ) returns part of allString from the first occurrence of occ to the end of allString. This function is case-sensitive. stristr() is identical to strstr() except that it is case insensitive.\n" +
                                    "\n" +
                                    "90) what is the difference between for and foreach?\n" +
                                    "\n" +
                                    "for is expressed as follows:\n" +
                                    "\n" +
                                    "for (expr1; expr2; expr3)\n" +
                                    "\n" +
                                    "statement\n" +
                                    "\n" +
                                    "The first expression is executed once at the beginning. In each iteration, expr2 is evaluated. If it is TRUE, the loop continues and the statements inside for are executed. If it evaluates to FALSE, the execution of the loop ends. expr3 is tested at the end of each iteration.\n" +
                                    "\n" +
                                    "However, foreach provides an easy way to iterate over arrays and it is only used with arrays and objects.\n" +
                                    "\n" +
                                    "91) Is it possible to submit a form with a dedicated button?\n" +
                                    "\n" +
                                    "It is possible to use the document.form.submit() function to submit the form. For example:\n" +
                                    "\n" +
                                    "92) What is the difference between ereg_replace() and eregi_replace()?\n" +
                                    "\n" +
                                    "The function eregi_replace() is identical to the function ereg_replace() except that it ignores case distinction when matching alphabetic characters.\n" +
                                    "\n" +
                                    "93) Is it possible to protect special characters in a query string?\n" +
                                    "\n" +
                                    "Yes, we use the urlencode() function to be able to protect special characters.\n" +
                                    "\n" +
                                    "94) What are the three classes of errors that can occur in PHP?\n" +
                                    "\n" +
                                    "The three basic classes of errors are notices (non-critical), warnings (serious errors) and fatal errors (critical errors).\n" +
                                    "\n" +
                                    "95) What is the difference between characters \\034 and \\x34?\n" +
                                    "\n" +
                                    "\\034 is octal 34 and \\x34 is hex 34.\n" +
                                    "\n" +
                                    "96) How can we pass the variable through the navigation between the pages?\n" +
                                    "\n" +
                                    "It is possible to pass the variables between the PHP pages using sessions, cookies or hidden form fields.\n" +
                                    "\n" +
                                    "97) Is it possible to extend the execution time of a php script?\n" +
                                    "\n" +
                                    "The use of the set_time_limit(int seconds) enables us to extend the execution time of a php script. The default limit is 30 seconds.\n" +
                                    "\n" +
                                    "98) Is it possible to destroy a cookie?\n" +
                                    "\n" +
                                    "Yes, it is possible by setting the cookie with a past expiration time.\n" +
                                    "\n" +
                                    "99) What is the default session time in php?\n" +
                                    "\n" +
                                    "The default session time in php is until closing of browser\n" +
                                    "\n" +
                                    "100) Is it possible to use COM component in PHP?\n" +
                                    "\n" +
                                    "Yes, it's possible to integrate (Distributed) Component Object Model components ((D)COM) in PHP scripts which is provided as a framework.\n" +
                                    "\n" +
                                    "Project Sap & All Modules\n" +
                                    "\n";
                            String site2 = "PHP";

                            Intent intent = new Intent(v.getContext(), CSS.class);
                            intent.putExtra(SITE1_KEY, site1);
                            intent.putExtra(SITE2_KEY, site2);
                            startActivity(intent);
                    }
            });

            mysqla.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            Toast.makeText(getBaseContext(), "Processing", Toast.LENGTH_SHORT).show();

                            String site1 = "MySQL Interview Questions\n" +
                                    "\n" +
                                    "1. What is MySQL? \n" +
                                    "\n" +
                                    "MySQL is an open source DBMS which is built, supported and distributed by MySQL AB (now acquired by Oracle)\n" +
                                    "\n" +
                                    "2. What are the technical features of MySQL? \n" +
                                    "\n" +
                                    "MySQL database software is a client or server system which includes\n" +
                                    "\n" +
                                    "Multithreaded SQL server supporting various client programs and libraries\n" +
                                    "Different backend\n" +
                                    "Wide range of application programming interfaces and\n" +
                                    "Administrative tools.\n" +
                                    "3. Why MySQL is used?\n" +
                                    "\n" +
                                    "MySQL database server is reliable, fast and very easy to use.  This software can be downloaded as freeware and can be downloaded from the internet.\n" +
                                    "\n" +
                                    "4. What are Heap tables?\n" +
                                    "\n" +
                                    "HEAP tables are present in memory and they are used for high speed storage on temporary\n" +
                                    "\n" +
                                    "basis.\n" +
                                    "\n" +
                                    "• BLOB or TEXT fields are not allowed\n" +
                                    "\n" +
                                    "• Only comparison operators can be used =, <,>, = >,=<\n" +
                                    "\n" +
                                    "• AUTO_INCREMENT is not supported by HEAP tables\n" +
                                    "\n" +
                                    "• Indexes should be NOT NULL\n" +
                                    "\n" +
                                    "5. What is the default port for MySQL Server?\n" +
                                    "\n" +
                                    "The default port for MySQL server is 3306.\n" +
                                    "\n" +
                                    "6.  What are the advantages of MySQL when compared with Oracle? \n" +
                                    "\n" +
                                    "MySQL is open source software which is available at any time and has no cost involved.\n" +
                                    "MySQL is portable\n" +
                                    "GUI with command prompt.\n" +
                                    "Administration is supported using MySQL Query Browser\n" +
                                    "7. Differentiate between FLOAT and DOUBLE? \n" +
                                    "\n" +
                                    "Following are differences for FLOAT and DOUBLE:\n" +
                                    "\n" +
                                    "• Floating point numbers are stored in FLOAT with eight place accuracy and it has four bytes.\n" +
                                    "\n" +
                                    "• Floating point numbers are stored in DOUBLE with accuracy of 18 places and it has eight bytes.\n" +
                                    "\n" +
                                    " 8. Differentiate CHAR_LENGTH and LENGTH?\n" +
                                    "\n" +
                                    "CHAR_LENGTH  is character count whereas the LENGTH is byte count. The numbers are same for Latin characters but they are different for Unicode and other encodings.\n" +
                                    "\n" +
                                    "9. How to represent ENUMs and SETs internally? \n" +
                                    "\n" +
                                    "ENUMs and SETs are used to represent powers of two because of storage optimizations.\n" +
                                    "\n" +
                                    "10. What is the usage of ENUMs in MySQL?\n" +
                                    "\n" +
                                    "ENUM is a string object used to specify set of predefined values and that can be used during table creation.\n" +
                                    "\n" +
                                    "\n" +
                                    "Create table size(name ENUM('Small', 'Medium','Large');\n" +
                                    "\n" +
                                    "1\n" +
                                    "Create table size(name ENUM('Small', 'Medium','Large');\n" +
                                    " 11. Define REGEXP? \n" +
                                    "\n" +
                                    "REGEXP is a pattern match in which  matches pattern anywhere in the search value.\n" +
                                    "\n" +
                                    "12. Difference between CHAR and VARCHAR? \n" +
                                    "\n" +
                                    "Following are the differences between CHAR and VARCHAR:\n" +
                                    "\n" +
                                    "CHAR and VARCHAR types differ in storage and retrieval\n" +
                                    "CHAR column length is fixed to the length that is declared while creating table. The length value ranges from 1 and 255\n" +
                                    "When CHAR values are stored then they are right padded using spaces to specific length. Trailing spaces are removed when CHAR values are retrieved.\n" +
                                    " 13. Give string types available for column?\n" +
                                    "\n" +
                                    "The string types are:\n" +
                                    "\n" +
                                    "SET\n" +
                                    "BLOB\n" +
                                    "ENUM\n" +
                                    "CHAR\n" +
                                    "TEXT\n" +
                                    "VARCHAR\n" +
                                    "14. How to get current MySQL version?\n" +
                                    "\n" +
                                    "\n" +
                                    "SELECT VERSION ();\n" +
                                    "\n" +
                                    "1\n" +
                                    "SELECT VERSION ();\n" +
                                    "is used to get the current version of MySQL.\n" +
                                    "\n" +
                                    " 15. What storage engines are used in MySQL? \n" +
                                    "\n" +
                                    "Storage engines are called table types and data is stored in files using various techniques.\n" +
                                    "\n" +
                                    "Technique involves:\n" +
                                    "\n" +
                                    "Storage mechanism\n" +
                                    "Locking levels\n" +
                                    "Indexing\n" +
                                    "Capabilities and functions.\n" +
                                    "16. What are the drivers in MySQL?\n" +
                                    "\n" +
                                    "Following are the drivers available in MySQL:\n" +
                                    "\n" +
                                    "PHP Driver\n" +
                                    "JDBC Driver\n" +
                                    "ODBC Driver\n" +
                                    "C WRAPPER\n" +
                                    "PYTHON Driver\n" +
                                    "PERL Driver\n" +
                                    "RUBY Driver\n" +
                                    "CAP11PHP Driver\n" +
                                    "Ado.net5.mxj\n" +
                                    "17. What does a TIMESTAMP do on UPDATE CURRENT_TIMESTAMP data type?\n" +
                                    "\n" +
                                    "TIMESTAMP column is updated with Zero when the table is created.  UPDATE CURRENT_TIMESTAMP modifier updates the timestamp field to  current time whenever there is a change in other fields of the table.\n" +
                                    "\n" +
                                    "18. What is the difference between primary key and candidate key?\n" +
                                    "\n" +
                                    "Every row of a table is identified uniquely by primary key. There is only one primary key for a table.\n" +
                                    "\n" +
                                    "Primary Key is also a candidate key. By common convention, candidate key can be designated as primary and which can be used for any foreign key references.\n" +
                                    "\n" +
                                    "19. How do you login to MySql using Unix shell?\n" +
                                    "\n" +
                                    "We can login through this command:\n" +
                                    "\n" +
                                    "# [mysql dir]/bin/mysql -h hostname -u <UserName> -p <password>\n" +
                                    "\n" +
                                    "20. What does myisamchk do?\n" +
                                    "\n" +
                                    "It compress the MyISAM tables, which reduces their disk or memory usage.\n" +
                                    "\n" +
                                    "21. How do you control the max size of a HEAP table?\n" +
                                    "\n" +
                                    "Maximum size of Heal table can be controlled by MySQL config variable called max_heap_table_size.\n" +
                                    "\n" +
                                    "22. What is the difference between MyISAM Static and MyISAM Dynamic?\n" +
                                    "\n" +
                                    "In MyISAM static all the fields will have fixed width. The Dynamic MyISAM table will have fields like TEXT, BLOB, etc. to accommodate the data types with various lengths.\n" +
                                    "\n" +
                                    "MyISAM Static would be easier to restore in case of corruption.\n" +
                                    "\n" +
                                    "23. What are federated tables?\n" +
                                    "\n" +
                                    "Federated tables which allow access to the tables located on other databases on other servers.\n" +
                                    "\n" +
                                    "24. What, if a table has one column defined as TIMESTAMP?\n" +
                                    "\n" +
                                    "Timestamp field gets the current timestamp whenever the row gets altered.\n" +
                                    "\n" +
                                    "25. What happens when the column is set to AUTO INCREMENT and if you reach maximum value in the table?\n" +
                                    "\n" +
                                    "It stops incrementing. Any further inserts are going to produce an error, since the key has been used already.\n" +
                                    "\n" +
                                    "26. How can we find out which auto increment was assigned on Last insert?\n" +
                                    "\n" +
                                    "LAST_INSERT_ID will return the last value assigned by Auto_increment and it is not required to specify the table name.\n" +
                                    "\n" +
                                    "27. How can you see all indexes defined for a table?\n" +
                                    "\n" +
                                    "Indexes are defined for the table by:\n" +
                                    "\n" +
                                    "SHOW INDEX FROM <tablename>;\n" +
                                    "\n" +
                                    "28. What do you mean by % and _ in the LIKE statement?\n" +
                                    "\n" +
                                    "% corresponds to 0 or more characters, _ is exactly one character in the LIKE statement.\n" +
                                    "\n" +
                                    "29. How can we convert between Unix & MySQL timestamps?\n" +
                                    "\n" +
                                    "UNIX_TIMESTAMP is the command which converts from MySQL timestamp to Unix timestamp\n" +
                                    "\n" +
                                    "FROM_UNIXTIME is the command which converts from Unix timestamp to MySQL timestamp.\n" +
                                    "\n" +
                                    "30. What are the column comparisons operators?\n" +
                                    "\n" +
                                    "The = , <>, <=, <, >=, >,<<,>>, <=>, AND, OR, or LIKE operators are used in column comparisons in SELECT statements.\n" +
                                    "\n" +
                                    " 31. How can we get the number of rows affected by query?\n" +
                                    "\n" +
                                    "Number of rows can be obtained by\n" +
                                    "\n" +
                                    "\n" +
                                    "SELECT COUNT (user_id) FROM users;\n" +
                                    "\n" +
                                    "1\n" +
                                    "SELECT COUNT (user_id) FROM users;\n" +
                                    "32.  Is Mysql query is case sensitive?\n" +
                                    "\n" +
                                    "No.\n" +
                                    "\n" +
                                    "\n" +
                                    "SELECT VERSION(), CURRENT_DATE;\n" +
                                    "SeLect version(), current_date;\n" +
                                    "seleCt vErSiOn(), current_DATE;\n" +
                                    "\n" +
                                    "1\n" +
                                    "2\n" +
                                    "3\n" +
                                    "SELECT VERSION(), CURRENT_DATE;\n" +
                                    "SeLect version(), current_date;\n" +
                                    "seleCt vErSiOn(), current_DATE;\n" +
                                    " All these examples are same. It is not case sensitive.\n" +
                                    "\n" +
                                    "33. What is the difference between the LIKE and REGEXP operators?  \n" +
                                    "\n" +
                                    "LIKE and REGEXP operators are used to express with ^ and %.\n" +
                                    "\n" +
                                    "\n" +
                                    "SELECT * FROM employee WHERE emp_name REGEXP \"^b\";\n" +
                                    "SELECT * FROM employee WHERE emp_name LIKE \"%b\";\n" +
                                    "\n" +
                                    "1\n" +
                                    "2\n" +
                                    "SELECT * FROM employee WHERE emp_name REGEXP \"^b\";\n" +
                                    "SELECT * FROM employee WHERE emp_name LIKE \"%b\";\n" +
                                    " 34. What is the difference between BLOB AND TEXT?\n" +
                                    "\n" +
                                    "A BLOB is a binary large object that can hold a variable amount of data. There are four types of BLOB –\n" +
                                    "\n" +
                                    "TINYBLOB\n" +
                                    "BLOB\n" +
                                    "MEDIUMBLOB and\n" +
                                    "LONGBLOB\n" +
                                    "They all differ only in the maximum length of the values they can hold.\n" +
                                    "\n" +
                                    "A TEXT is a case-insensitive BLOB. The four TEXT types\n" +
                                    "\n" +
                                    "TINYTEXT\n" +
                                    "TEXT\n" +
                                    "MEDIUMTEXT and\n" +
                                    "LONGTEXT\n" +
                                    "They all correspond to the four BLOB types and have the same maximum lengths and storage requirements.\n" +
                                    "\n" +
                                    "The only difference between BLOB and TEXT types is that sorting and comparison is performed in case-sensitive for BLOB values and case-insensitive for TEXT values.\n" +
                                    "\n" +
                                    "35. What is the difference between mysql_fetch_array and mysql_fetch_object?\n" +
                                    "\n" +
                                    "Following are the differences between mysql_fetch_array and mysql_fetch_object:\n" +
                                    "\n" +
                                    "mysql_fetch_array() -Returns a result row as an associated array or a regular array from database.\n" +
                                    "\n" +
                                    "mysql_fetch_object –  Returns a result row as object from database.\n" +
                                    "\n" +
                                    "36. How can we run batch mode in mysql?\n" +
                                    "\n" +
                                    "Following commands are used to run in batch mode:\n" +
                                    "\n" +
                                    "\n" +
                                    "mysql ;\n" +
                                    "mysql mysql.out\n" +
                                    "\n" +
                                    "1\n" +
                                    "2\n" +
                                    "mysql ;\n" +
                                    "mysql mysql.out\n" +
                                    " 37. Where MyISAM table will be stored and also give their formats of storage?\n" +
                                    "\n" +
                                    "Each MyISAM table is stored on disk in three formats:\n" +
                                    "\n" +
                                    "The ‘.frm’ file stores the table definition\n" +
                                    "The data file has a ‘.MYD’ (MYData) extension\n" +
                                    "The index file has a ‘.MYI’ (MYIndex) extension\n" +
                                    "38. What are the different tables present in MySQL?\n" +
                                    "\n" +
                                    "Total 5 types of tables are present:\n" +
                                    "\n" +
                                    "MyISAM\n" +
                                    "Heap\n" +
                                    "Merge\n" +
                                    "INNO DB\n" +
                                    "ISAM\n" +
                                    "MyISAM is the default storage engine as of MySQL .\n" +
                                    "\n" +
                                    "39. What is ISAM?\n" +
                                    "\n" +
                                    "ISAM  is abbreviated as Indexed Sequential Access Method.It was developed by IBM to store and retrieve data on secondary storage systems like tapes.\n" +
                                    "\n" +
                                    " 40. What is InnoDB?\n" +
                                    "\n" +
                                    "lnnoDB is a transaction safe storage engine developed by Innobase Oy which is a Oracle Corporation now.\n" +
                                    "\n" +
                                    "41. How MySQL Optimizes DISTINCT?\n" +
                                    "\n" +
                                    "DISTINCT is converted to a GROUP BY on all columns and it will be combined with ORDER BY clause.\n" +
                                    "\n" +
                                    "\n" +
                                    "SELECT DISTINCT t1.a FROM t1,t2 where t1.a=t2.a;\n" +
                                    "\n" +
                                    "1\n" +
                                    "SELECT DISTINCT t1.a FROM t1,t2 where t1.a=t2.a;\n" +
                                    "42. How to enter Characters as HEX Numbers?\n" +
                                    "\n" +
                                    "If you want to enter characters as HEX numbers, you can enter HEX numbers with single quotes and a prefix of (X), or just prefix HEX numbers with (Ox).\n" +
                                    "\n" +
                                    "A HEX number string will be automatically converted into a character string, if the expression context is a string.\n" +
                                    "\n" +
                                    "43. How to display top 50 rows?\n" +
                                    "\n" +
                                    "In MySql, top 50 rows are displayed by using this following query:\n" +
                                    "\n" +
                                    "\n" +
                                    "SELECT * FROM\n" +
                                    "LIMIT 0,50;\n" +
                                    "\n" +
                                    "1\n" +
                                    "2\n" +
                                    "SELECT * FROM\n" +
                                    "LIMIT 0,50;\n" +
                                    " \n" +
                                    "\n" +
                                    "44. How many columns can be used for creating Index?\n" +
                                    "\n" +
                                    "Maximum of 16 indexed columns can be created for any standard table.\n" +
                                    "\n" +
                                    "45. What is the different between NOW() and CURRENT_DATE()?\n" +
                                    "\n" +
                                    "NOW () command is used to show current year,month,date with hours,minutes and seconds.\n" +
                                    "\n" +
                                    "CURRENT_DATE() shows current year,month and date only.\n" +
                                    "\n" +
                                    "46. What are the objects can be created using CREATE statement?\n" +
                                    "\n" +
                                    "Following objects are created using CREATE statement:\n" +
                                    "\n" +
                                    "DATABASE\n" +
                                    "EVENT\n" +
                                    "FUNCTION\n" +
                                    "INDEX\n" +
                                    "PROCEDURE\n" +
                                    "TABLE\n" +
                                    "TRIGGER\n" +
                                    "USER\n" +
                                    "VIEW\n" +
                                    "47. How many TRIGGERS are allowed in MySql table?\n" +
                                    "\n" +
                                    "SIX triggers are allowed in MySql table. They are as follows:\n" +
                                    "\n" +
                                    "BEFORE INSERT\n" +
                                    "AFTER INSERT\n" +
                                    "BEFORE UPDATE\n" +
                                    "AFTER UPDATE\n" +
                                    "BEFORE DELETE and\n" +
                                    "AFTER DELETE\n" +
                                    "48. What are the nonstandard string types?\n" +
                                    "\n" +
                                    "Following are Non-Standard string types:\n" +
                                    "\n" +
                                    "TINYTEXT\n" +
                                    "TEXT\n" +
                                    "MEDIUMTEXT\n" +
                                    "LONGTEXT\n" +
                                    "49. What are all the Common SQL Function?\n" +
                                    "\n" +
                                    "CONCAT(A, B) – Concatenates two string values to create a single string output. Often used to combine two or more fields into one single field.\n" +
                                    "\n" +
                                    "FORMAT(X, D) – Formats the number X to D significant digits.\n" +
                                    "\n" +
                                    "CURRDATE(), CURRTIME() – Returns the current date or time.\n" +
                                    "\n" +
                                    "NOW() – Returns the current date and time as one value.\n" +
                                    "\n" +
                                    "MONTH(), DAY(), YEAR(), WEEK(), WEEKDAY() – Extracts the given data from a date value.\n" +
                                    "\n" +
                                    "HOUR(), MINUTE(), SECOND() – Extracts the given data from a time value.\n" +
                                    "\n" +
                                    "DATEDIFF(A, B) – Determines the difference between two dates and it is commonly used to calculate age\n" +
                                    "\n" +
                                    "SUBTIMES(A, B) – Determines the difference between two times.\n" +
                                    "\n" +
                                    "FROMDAYS(INT) – Converts an integer number of days into a date value.\n" +
                                    "\n" +
                                    "50. Explain Access Control Lists.\n" +
                                    "\n" +
                                    "An ACL (Access Control List) is a list of permissions that is associated with an object. This list is the basis for MySQL server’s security model and it helps in troubleshooting problems like users not being able to connect.\n" +
                                    "\n" +
                                    "MySQL keeps the ACLs (also called grant tables) cached in memory. When a user tries to authenticate or run a command, MySQL checks the authentication information and permissions against the ACLs, in a predetermined order.";
                            String site2 = "MySql";

                            Intent intent = new Intent(v.getContext(), CSS.class);
                            intent.putExtra(SITE1_KEY, site1);
                            intent.putExtra(SITE2_KEY, site2);
                            startActivity(intent);
                    }
            });

            jqa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            Toast.makeText(getBaseContext(), "Processing", Toast.LENGTH_SHORT).show();

                            String site1 = "JQuery Interview Questions\n" +
                                    "\n" +
                                    "1. What is jQuery?\n" +
                                    "\n" +
                                    "jQuery is not a programming language but a well written JavaScript code. It is a JavaScript code, which do document traversing, event handling, Ajax interactions and Animations.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "2. Why jQuery is needed?\n" +
                                    "\n" +
                                    "jQuery is needed for the following list:\n" +
                                    "\n" +
                                    "·         Used to develop browser compatible web applications\n" +
                                    "·         Improve the performance of an application\n" +
                                    "·         Very fast and extensible\n" +
                                    "·         UI related functions are written in minimal lines of codes\n" +
                                    "·          \n" +
                                    "\n" +
                                    "3. Whether jQuery HTML work for both HTML and XML documents?\n" +
                                    "\n" +
                                    "No, jQuery HTML only works for HTML documents not for XML Documents.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "4. What are the methods used to provide effects?\n" +
                                    "\n" +
                                    "Some of the effects methods are:\n" +
                                    "\n" +
                                    "·         Show()\n" +
                                    "·         Hide()\n" +
                                    "·         Toggle()\n" +
                                    "·         FadeIn()\n" +
                                    "·         FadeOut()\n" +
                                    " \n" +
                                    "\n" +
                                    "5. What is the advantage of using minimized version of jQuery?\n" +
                                    "\n" +
                                    "Efficiency of web page increases when minimized version of jQuery is used.min.js file will be more than 50% less than the normal js file. Reduction in the file size makes the web page faster.  \n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "6. Is jQuery is a JavaScript or JSON library file?\n" +
                                    "\n" +
                                    "jQuery is a library of JavaScript file and it consists of DOM, event effects and the Ajax functions. jQuery is said to be a single JavaScript file.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "7. Which operating system is more compatible with jQuery?\n" +
                                    "\n" +
                                    "Mac, Windows and Linux are more compatible with the jQuery.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "8. How can we include jQuery library in ASP.Net project?\n" +
                                    "\n" +
                                    "Download the jQuery library from jQuery.com and include that reference in the asp.net page.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "9. Which command will give a version of jQuery?\n" +
                                    "\n" +
                                    "The command $.ui.version returns jQuery UI version.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "10. In what scenarios jQuery can be used?\n" +
                                    "\n" +
                                    "jQuery can be used in following scenarios:\n" +
                                    "\n" +
                                    "Apply CSS static or dynamic Calling functions on events Manipulation purpose Mainly for Animation effects\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "11. What is the difference between find and children methods?\n" +
                                    "\n" +
                                    "Find method is used to find all levels down the DOM tree but children find single level down the DOM tree.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "12. What is jQuery connect?\n" +
                                    "\n" +
                                    "A ‘ jQuery connect’  is a plugin used to connect or bind a function with another  function. Connect is used to execute function from any other function or plugin is executed.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "13. How to use connect?\n" +
                                    "\n" +
                                    "Connect can be used by downloading jQuery connect file from jQuery.com and then include that file in the HTML file. Use $.connect function to connect a function to another function.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "14. What are the features of jQuery, has been used in web applications? jQuery uses features like\n" +
                                    "\n" +
                                    "Sliding, File uploading and accordian in web applications.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "15. What are the browser related issues for jQuery?\n" +
                                    "\n" +
                                    "Browser compatibility of jQuery plugin is an issue and needs lot of time to fix it.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    " 16 . Whether we need to add jQuery file in both Master and Content page?\n" +
                                    "\n" +
                                    "jQuery file should be added to the Master page and can use access from the content page directly without having any reference to it.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "17. What are the basic selectors in jQuery?\n" +
                                    "\n" +
                                    "Following are the basic selectors in jQuery:\n" +
                                    "\n" +
                                    "·         Element ID\n" +
                                    "·         CSS Name\n" +
                                    "·         Tag Name\n" +
                                    "·         DOM hierarchy\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "18. Can we call C# code behind using jQuery?\n" +
                                    "\n" +
                                    "Yes, we can call C# code from jQuery as it supports .net application.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "19. What is the use jQuery.data method?\n" +
                                    "\n" +
                                    "jQuery.data methods is used to associate the data with the DOM nodes and the objects. This data method makes the jQuery code clear and concise.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "20. What is the use of each function in jQuery?\n" +
                                    "\n" +
                                    "Each function is used to iterate each and every element of an object. It is used to loop DOM elements, arrays and the object properties.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "21. What is the difference between size and length of jQuery?\n" +
                                    "\n" +
                                    "Size and length both returns the number of element in an object. But length is faster than the size because length is a property and size is a method.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "22. Can we add more than one ‘document.ready’ function in a page?\n" +
                                    "\n" +
                                    "Yes, we can add more than one document.ready function in a page. But, body.onload can be added once in a page.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "23. What is the use of jQuery load method?\n" +
                                    "\n" +
                                    "jQuery load method is a powerful AJAX method which is used to load the data from a server and assign the data into the element without loading the page. 24. Whether our own specific characters are used in place of $ in jQuery?\n" +
                                    "\n" +
                                    "Yes, We can use our own variable in place of $ by suing the method called no Conflict () method.\n" +
                                    "\n" +
                                    "var sample = $.noConflict()\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "25. What are the four parameters used for jQuery Ajax method?\n" +
                                    "\n" +
                                    "The four parameters are\n" +
                                    "\n" +
                                    "·         URL - Need to specify the URL to send the request\n" +
                                    "·         type - Specifies type of request(Get or Post)\n" +
                                    "·         data - Specifies data to be sent to server\n" +
                                    "·         Cache - Whether the browser should cache the requested page\n" +
                                    " \n" +
                                    "\n" +
                                    "26 . What is the use of jQuery filter?\n" +
                                    "\n" +
                                    "The jQuery filter is used to filter the certain values from the object list based on the criteria. Example is to filter certain products from the master list of products in a cart website.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "27. Which program is useful for testing jQuery?\n" +
                                    "\n" +
                                    "QUnit is used to test jQuery and it is very easy and efficient.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "28. What is CDN?\n" +
                                    "\n" +
                                    "CDN is abbreviated as Content Distribution network and it is said to be a group of companies in different location with network containing copies of data files to maximize bandwidth in accessing the data.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "29. What are the two types of CDNs?\n" +
                                    "\n" +
                                    "There are two types of CDNs:\n" +
                                    "\n" +
                                    "·         Microsoft – Load jQuery from Ajax\n" +
                                    "·         CDN Google – Load jQuery from Google libraries API\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "30. Which sign is used as a shortcut for jQuery?\n" +
                                    "\n" +
                                    "Dollar ($) sign is used as a shortcut for jQuery.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "31. Is jQuery is a client or server scripting?\n" +
                                    "\n" +
                                    "jQuery is a client scripting.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "32. What is the script build up by jQuery?\n" +
                                    "\n" +
                                    "jQuery is a Javascript file and it is single javascript file that contains common DOM, event effects and Ajax functions.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "33. How can we debug jQuery?\n" +
                                    "\n" +
                                    "There are two ways to debug jQuery:\n" +
                                    "\n" +
                                    "Debugger keyword\n" +
                                    "\n" +
                                    "Add the debugger to the line from where we have to start debugging and then run Visual Studio in Debug mode with F5 function key.\n" +
                                    "\n" +
                                    "Insert a break point after attaching the process\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "34. What are all the ways to include jQuery in a page?\n" +
                                    "\n" +
                                    "Following are the ways to include jQuery in a page:\n" +
                                    "\n" +
                                    "·         Local copy inside script tag\n" +
                                    "·         Remote copy of jQuery.com\n" +
                                    "·         Remote copy of Ajax API\n" +
                                    "·         Local copy of script manager control\n" +
                                    "·         Embedded script using client script object\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "35. What is the use of jQuery.ajax method ()? jQuery.ajax method is used for\n" +
                                    "\n" +
                                    "asynchronous HTTP requests.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "36. Where can we download JQuery?\n" +
                                    "\n" +
                                    "jQuery javascript can be downloaded from jQuery official website – www.jquery.com\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "37. Is jQuery is a replacement of JavaScript?\n" +
                                    "\n" +
                                    "No, jQuery is not a replacement of JavaScript.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "38. What is called chaining?\n" +
                                    "\n" +
                                    "Chaining is used to connect multiple events and functions in a selector.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "39. What are the advantages of jQuery?\n" +
                                    "\n" +
                                    "Following are the advantages of jQuery:\n" +
                                    "\n" +
                                    "Just a JavaScript enhancement Coding is simple, clear, reusable Removal of writing more complex conditions and loops\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "40. Whether C# code behind can be called from jQuery?\n" +
                                    "\n" +
                                    "Yes, we can call C# code behind from jQuery.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "41. What is the use of jQuery.data() method?\n" +
                                    "\n" +
                                    "jQuery data method is used to associate data with DOM nodes and JavaScript objects. This method will make a code very concise and neat.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "42. What is the difference between onload() and document.ready()?\n" +
                                    "\n" +
                                    "In a page, we can have only one onload function but we can have more than one document.ready function. Document.ready function is called when DOM is loaded but onload function is called when DOM and images are loaded on the page.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "43. What is the use of jQuery each function?\n" +
                                    "\n" +
                                    "jQuery each function is used to loop through each and every element of the target jQuery object. It is also useful for multi element DOM, looping arrays and object properties.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "44. How method can be called inside code behind using jQuery?\n" +
                                    "\n" +
                                    "$.ajax can be called and by declaring WebMethod inside code behind using jQuery.\n" +
                                    "\n" +
                                    "45. Which is the fastest selector in jQuery?\n" +
                                    "\n" +
                                    "ID and Element are the fastest selectors in jQuery.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "46. What is the slowest selector in jQuery?\n" +
                                    "\n" +
                                    "Class selectors are the slowest selectors in jQuery.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "47. Where jQuery code is getting executed?\n" +
                                    "\n" +
                                    "jQuery code is getting executed on a client browser.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "48. What is the method used to define the specific character in place of $ sign?\n" +
                                    "\n" +
                                    "‘NoConflict’ method is used to reference a jQuery and save it in a variable. That variable can be used instead of Sign.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "49. Why jQuery is better than JavaScript?\n" +
                                    "\n" +
                                    "jQuery is a library used for developing Ajax application and it helps to write the code clean and concise. It also handles events, animation and Ajax support applications.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "50. What are the types of selectors in jQuery?\n" +
                                    "\n" +
                                    "There are three types of selectors in jQuery:\n" +
                                    "\n" +
                                    "·         CSS Selector\n" +
                                    "·         XPath Selector\n" +
                                    "·         Custom Selector";
                            String site2 = "JQuery";

                            Intent intent = new Intent(v.getContext(), CSS.class);
                            intent.putExtra(SITE1_KEY, site1);
                            intent.putExtra(SITE2_KEY, site2);
                            startActivity(intent);
                    }
            });

            jsa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            Toast.makeText(getBaseContext(), "Processing", Toast.LENGTH_SHORT).show();

                            String site1 = "JavaScript Interview Questions\n" +
                                    "\n" +
                                    "1. What is JavaScript?\n" +
                                    "\n" +
                                    "JavaScript is a client-side scripting language that can be inserted into HTML pages and is understood by web browsers.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "2. Enumerate the differences between Java and JavaScript?\n" +
                                    "\n" +
                                    "Java is a complete programming language. In contrast, JavaScript is a coded program that can be introduced to HTML pages. These two languages are not at all inter-dependent and are designed for the different intent.  Java is an object - oriented programming (OOPS) or structured programming language like C++ or C whereas JavaScript is a client-side scripting language and it is said to be unstructured programming.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "3. What are JavaScript types?\n" +
                                    "\n" +
                                    "Following are the JavaScript types:\n" +
                                    "\n" +
                                    "·         Number\n" +
                                    "·         String\n" +
                                    "·         Boolean\n" +
                                    "·         Function\n" +
                                    "·         Object\n" +
                                    "·         Null\n" +
                                    "·         Undefined\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "4. What is the use of isNaN function?\n" +
                                    "\n" +
                                    "isNan function returns true if the argument is not a number otherwise it is false.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "5. Between JavaScript and an ASP script, which is faster?\n" +
                                    "\n" +
                                    "JavaScript is faster. JavaScript is a client-side language and thus it does not need the assistance of the web server to execute. On the other hand, ASP is a server-side language and hence is always slower than JavaScript.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "6. What is negative infinity?\n" +
                                    "\n" +
                                    "Negative Infinity is a number in JavaScript which can be derived by dividing negative number by zero.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "7. Is it possible to break JavaScript Code into several lines?\n" +
                                    "\n" +
                                    "Breaking within a string statement can be done by the use of a backslash, ‘\\’, at the end of the first line\n" +
                                    "\n" +
                                    "Example: [crayon-5460b64160335252603799/] And if you change to a new line when not within a string statement, then javaScript ignores break in line.\n" +
                                    "\n" +
                                    "Example: [crayon-5460b64160348620793456/] The above code is perfectly fine, though not advisable as it hampers debugging.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "8. Which company developed JavaScript?\n" +
                                    "\n" +
                                    "Netscape is the software company who developed JavaScript.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "9. What are undeclared and undefined variables?\n" +
                                    "\n" +
                                    "Undeclared variables are those that do not exist in a program and are not declared. If the program tries to read the value of an undeclared variable, then a runtime error is encountered.\n" +
                                    "\n" +
                                    "Undefined variables are those that are declared in the program but have not been given any value. If the program tries to read the value of an undefined variable, an undefined value is returned.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "10. Write the code for adding new elements dynamically?\n" +
                                    "\n" +
                                    " [crayon-5460b6416034b673352114/]\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "11. What are global variables? How are these variable declared and what are the problems associated with using them?\n" +
                                    "\n" +
                                    "Global variables are those that are available throughout the length of the code, that is, these have no scope. The var keyword is used to declare a local variable or object. If the var keyword is omitted, a global variable is declared.\n" +
                                    "\n" +
                                    "Example:\n" +
                                    "\n" +
                                    "// Declare a global globalVariable = \"Test\";\n" +
                                    "\n" +
                                    "The problems that are faced by using global variables are the clash of variable names of local and global scope. Also, it is difficult to debug and test the code that relies on global variables.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "12. What is a prompt box?\n" +
                                    "\n" +
                                    "A prompt box is a box which allows the user to enter input by providing a text box.  Label and box will be provided to enter the text or number.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "13. What is ‘this’ keyword in JavaScript?\n" +
                                    "\n" +
                                    "‘This’ keyword is used to point at the current object in the code. For instance: If the code is presently at an object created by the help of the ‘new’ keyword, then ‘this’ keyword will point to the object being created.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "14. Explain the working of timers in JavaScript? Also elucidate the drawbacks of using the timer, if any?\n" +
                                    "\n" +
                                    "Timers are used to execute a piece of code at a set time or also to repeat the code in a given interval of time. This is done by using the functions setTimeout, setInterval and clearInterval.\n" +
                                    "\n" +
                                    "The setTimeout(function, delay) function is used to start a timer that calls a particular function after the mentioned delay. The setInterval(function, delay) function is used to repeatedly execute the given function in the mentioned delay and only halts when cancelled. The clearInterval(id) function instructs the timer to stop.\n" +
                                    "\n" +
                                    "Timers are operated within a single thread, and thus events might queue up, waiting to be executed.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "15. Which symbol is used for comments in Javascript?\n" +
                                    "\n" +
                                    "// for Single line comments and\n" +
                                    "\n" +
                                    "/*   Multi\n" +
                                    "\n" +
                                    "Line\n" +
                                    "\n" +
                                    "Comment\n" +
                                    "\n" +
                                    "*/\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "16. What is the difference between ViewState and SessionState?\n" +
                                    "\n" +
                                    "‘ViewState’ is specific to a page in a session.\n" +
                                    "\n" +
                                    "‘SessionState’ is specific to user specific data that can be accessed across all pages in the web application.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "17. What is === operator?\n" +
                                    "\n" +
                                    "=== is called as strict equality operator which returns true when the two operands are having the same value without any type conversion.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "18. Name all the datatypes available in javascript?\n" +
                                    "\n" +
                                    "The different datatypes are:\n" +
                                    "\n" +
                                    "·         Number\n" +
                                    "·         String\n" +
                                    "·         Boolean\n" +
                                    "·         Function\n" +
                                    "·         Object\n" +
                                    "·         Null\n" +
                                    "·         Undefined\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "19. What are \"undeclared\" and \"undefined\" variables?\n" +
                                    "\n" +
                                    "Undeclared variables are declared during run time and those variables cannot be declared in the program.\n" +
                                    "\n" +
                                    "Undefined variables are the variables that are declared before assigning value to the program.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "20. How can the style/class of an element be changed?\n" +
                                    "\n" +
                                    "It can be done in the following way: [crayon-5460b6416034f421097026/] or [crayon-5460b64160352176208423/]\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "21. Define the occurrence of negative infinity in JavaScript?\n" +
                                    "\n" +
                                    "Negative infinity is a special number which comes up when a negative number is divided by zero.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    " 22. What are all the looping structures in JavaScript?\n" +
                                    "\n" +
                                    "Following are looping structures in Javascript:\n" +
                                    "\n" +
                                    "·         For\n" +
                                    "·         While\n" +
                                    "·         do-while loops\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "23. What is called Variable typing in Javascript?\n" +
                                    "\n" +
                                    "Variable typing is used to assign a number to a variable and the same variable can be assigned\n" +
                                    "\n" +
                                    "to a string.\n" +
                                    "\n" +
                                    "Example [crayon-5460b64160355238239348/] This is called variable typing.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "24. How can you convert the string of any base to integer in JavaScript?\n" +
                                    "\n" +
                                    "The parseInt() function is used to convert numbers between different bases. parseInt() takes the string to be converted as its first parameter, and the second parameter is the base of the given string.\n" +
                                    "\n" +
                                    "In order to convert 4F (of base 16) to integer, the code used will be - [crayon-5460b64160357815161658/]\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "25. Explain the difference between “==” and “===”?\n" +
                                    "\n" +
                                    "“==” checks only for equality in value whereas “===” is a stricter equality test and returns false if either the value or the type of the two variables are different.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "26. What would be the result of 3+2+\"7\"?\n" +
                                    "\n" +
                                    "Since 3 and 2 are integers, they will be added numerically. And since 7 is a string, its concatenation will be done. So the result would be 57.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "27. How can we append a value to an array?\n" +
                                    "\n" +
                                    "Array value can be appended by arr[arr.length] = value;\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "28. What do mean by NULL in Javascript?\n" +
                                    "\n" +
                                    "The NULL value is used to represent no value or no object.  It implies no object or null string, no valid boolean value, no number and no array object.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "29. What is the function of delete operator?\n" +
                                    "\n" +
                                    "The functionality of delete operator is used to delete all variables and objects in a program but it cannot delete variables declared with VAR keyword.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "30. What is an undefined value in JavaScript?\n" +
                                    "\n" +
                                    "Undefined value means the\n" +
                                    "\n" +
                                    "·         Variable used in the code doesn’t exist\n" +
                                    "·         Variable is not assigned to any value\n" +
                                    "·         Property doesn’t exist\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "31. What are all the types of Pop up boxes available in JavaScript?\n" +
                                    "\n" +
                                    "·         Alert\n" +
                                    "·         Confirm and\n" +
                                    "·         Prompt\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "32. What is the use of Void(0)?\n" +
                                    "\n" +
                                    "Void(0) is used to prevent the page from refreshing and parameter \"zero\" is passed while calling.\n" +
                                    "\n" +
                                    "Void(0) is used to call another method without refreshing the page.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "33. How can a page be forced to load another page in JavaScript?\n" +
                                    "\n" +
                                    "The following code has to be inserted to achieve the desired effect: [crayon-5460b6416035b636060084/]\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "34. What is the data type of variables of in JavaScript?\n" +
                                    "\n" +
                                    "All variables in the JavaScript are object data types.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "35. What is the difference between an alert box and a confirmation box?\n" +
                                    "\n" +
                                    "An alert box displays only one button which is the OK button.\n" +
                                    "\n" +
                                    "But a Confirmation box displays two buttons namely OK and cancel.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "36. What are escape characters?\n" +
                                    "\n" +
                                    "Escape characters (Backslash) is used when working with special characters like single quotes, double quotes, apostrophes and ampersands. Place backslash before the characters to make it display.\n" +
                                    "\n" +
                                    "Example: [crayon-5460b6416035d308483037/]\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "37. What are JavaScript Cookies?\n" +
                                    "\n" +
                                    "Cookies are the small test files stored in a computer and it gets created when the user visits the websites to store information that they need. Example could be User Name details and shopping cart information from the previous visits.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "38. What are the looping structures used in JavaScript?\n" +
                                    "\n" +
                                    "·         For\n" +
                                    "·         While\n" +
                                    "·         Do---while\n" +
                                    "·         For each\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "39. Whether JavaScript has concept level scope?\n" +
                                    "\n" +
                                    "No. JavaScript does not have concept level scope. The variable declared inside the function has scope inside the function.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "40. What is the use of delete operator in JavaScript?\n" +
                                    "\n" +
                                    "The delete operator is used to delete all the variables used in the program. It does not delete variables declared with the VAR keyword.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "41. What is break and continue statements?\n" +
                                    "\n" +
                                    "Break statement exits from the current loop.\n" +
                                    "\n" +
                                    "Continue statement continues with next statement of the loop.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "42. What are the two basic groups of dataypes in JavaScript?\n" +
                                    "\n" +
                                    "They are as –\n" +
                                    "\n" +
                                    "Primitive Reference types.\n" +
                                    "\n" +
                                    "Primitive types are number and Boolean data types. Reference types are more complex types like strings and dates.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "43. How generic objects can be created?\n" +
                                    "\n" +
                                    "Generic objects can be created as: [crayon-5460b64160360650861559/]\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "44. What is the use of type of operator?\n" +
                                    "\n" +
                                    "‘Typeof’ is an operator which is used to return a string description of the type of a variable.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "45. Which keywords are used to handle exceptions?\n" +
                                    "\n" +
                                    "Try… Catch---finally is used to handle exceptions in the JavaScript [crayon-5460b6416036a084662851/]\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "46. Which keyword is used to print the text in the screen?\n" +
                                    "\n" +
                                    "document.write(“Welcome”) is used to print the text – Welcome in the screen.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "47. What is the use of blur function?\n" +
                                    "\n" +
                                    "Blur function is used to remove the focus from the specified object.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "48. What is variable typing?\n" +
                                    "\n" +
                                    "Variable typing is used to assign a number to a variable and then assign string to the same variable. Example is as follows: [crayon-5460b6416036d993767509/]\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "49. How to find operating system in the client machine using JavaScript?\n" +
                                    "\n" +
                                    "The ‘Navigator.appversion’ is used to find the name of the operating system in the client machine.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "50. What are the different types of errors in JavaScript?\n" +
                                    "\n" +
                                    "There are three types of errors:\n" +
                                    "\n" +
                                    "·         Load time errors: Errors which come up when loading a web page like improper syntax errors are known as Load time errors and it generates the errors dynamically.\n" +
                                    "·         Run time errors: Errors that come due to misuse of the command inside the HTML language.\n" +
                                    "·         Logical Errors: These are the errors that occur due to the bad logic performed on a function which is having different operation.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "51. What is the use of Push method in JavaScript?\n" +
                                    "\n" +
                                    "The push method is used to add or append one or more elements to the end of an Array. Using this method, we can append multiple elements by passing multiple arguments\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "52. What is unshift method in JavaScript?\n" +
                                    "\n" +
                                    "Unshift method is like push method which works at the beginning of the array.  This method is used to prepend one or more elements to the beginning of the array.\n" +
                                    "\n";
                            String site2 = "JS";

                            Intent intent = new Intent(v.getContext(), CSS.class);
                            intent.putExtra(SITE1_KEY, site1);
                            intent.putExtra(SITE2_KEY, site2);
                            startActivity(intent);
                    }
            });

            html5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            Toast.makeText(getBaseContext(), "Processing", Toast.LENGTH_SHORT).show();

                            String site1 = "HTML5 Interview Questions\n" +
                                    "\n" +
                                    "1. What is the use of Canvas Element in HTML5? \n" +
                                    "\n" +
                                    "HTML5 Canvas element can be used to draw graphics images on a web page by using javascript.\n" +
                                    "\n" +
                                    "2. Can you give an example of Canvas element how it can be used?\n" +
                                    "\n" +
                                    "<canvas id=“DGTCanvas” width=“500″ height=“400″>\n" +
                                    "</canvas>\n" +
                                    "<script type=“text/javascript”>\n" +
                                    "var DGTCanvas=document.getElementById(“DGTCanvas”);\n" +
                                    "var DGTText=DGTCanvas.getContext(“2d”);\n" +
                                    "DGTText.fillStyle=“#82345c”;\n" +
                                    "DGTText.fillRect(0,0,150,75);\n" +
                                    "</script>\n" +
                                    "\n" +
                                    "This book is far better than any other learning material. It has very basic information that includes both HTML5 and CSS3 with sample code and comprehensive examples.\n" +
                                    "\n" +
                                    "3. What is the purpose of HTML5 versus XHTML?\n" +
                                    "\n" +
                                    "HTML5 is the next version of HTML 4.01, XHTML 1.0 and DOM Level 2 HTML. It aims to reduce the need for proprietary plug-in-based rich internet application (RIA) technologies such as Adobe Flash, Microsoft Silverlight, Apache Pivot, and Sun JavaFX. Instead of using those plugins, it enables browser to serve elements such as video and audio without any additional requirements on the client machine.\n" +
                                    "\n" +
                                    " 4. What is the difference between HTML and HTML5 ?\n" +
                                    "\n" +
                                    "HTML5 is nothing more then upgraded version of HTML where in HTML5 supports the innovative features such as Video, Audio/mp3, date select function , placeholder , Canvas, 2D/3D Graphics, Local SQL Database added so that no need to do external plugin like Flash player or other library elemenents.\n" +
                                    "\n" +
                                    "5. WHAT are some other advantages of HTML5?\n" +
                                    "\n" +
                                    "a) Cleaner markup than earlier versions of HTML\n" +
                                    "b) Additional semantics of new elements like <header>, <nav>, and <time>\n" +
                                    "c) New form input types and attributes that will (and in Opera’s case, do) take the hassle out of scripting forms.\n" +
                                    "\n" +
                                    "6. What is the <!DOCTYPE>? Is it mandatory to use in HTML5?\n" +
                                    "\n" +
                                    "The <!DOCTYPE> is an instruction to the web browser about what version of HTML the page is written in. The <!DOCTYPE> tag does not have an end tag. It is not case sensitive.\n" +
                                    "\n" +
                                    "The <!DOCTYPE> declaration must be the very first thing in HTML5 document, before the <html> tag.  As In HTML 4.01, all <! DOCTYPE > declarations require a reference to a Document Type Definition (DTD), because HTML 4.01 was based on Standard Generalized Markup Language (SGML). WHERE AS HTML5 is not based on SGML, and therefore does not require a reference to a Document Type Definition (DTD).\n" +
                                    "\n" +
                                    "7. What are the New Media Elements in HTML5?\n" +
                                    "\n" +
                                    "New Media Elements in HTML5 are :\n" +
                                    "\n" +
                                    "Tag\n" +
                                    "Description\n" +
                                    "<audio>\n" +
                                    "For multimedia content, sounds, music or other audio streams\n" +
                                    "<video>\n" +
                                    "For video content, such as a movie clip or other video streams\n" +
                                    "<source>\n" +
                                    "For media resources for media elements, defined inside video or audio\n" +
                                    "elements\n" +
                                    "<embed>\n" +
                                    "For embedded content, such as a plug-in\n" +
                                    "<track>\n" +
                                    "For text tracks used in mediaplayers\n" +
                                    "8. What is the major improvement with HTML5 in reference to Flash?\n" +
                                    "\n" +
                                    "Flash is not supported by major mobile devices such as iPad, iPhone and universal android applications. Those mobile devices have lack of support for installing flash plugins. HTML5 is supported by all the devices, apps and browser including Apple and Android products. Compared to Flash, HTML5 is very secured and protected. That eliminates major concerns that we have seen with Flash.\n" +
                                    "\n" +
                                    "10. What is the sessionStorage Object in html5 ? How you can create and access that?\n" +
                                    "\n" +
                                    "The HTML5 sessionStorage object stores the data for one session. The data is deleted when the user closes the browser window. We can create and access a sessionStorage, created “name” as session\n" +
                                    "\n" +
                                    "<script type=“text/javascript”>\n" +
                                    "sessionStorage.name=“DGTECH”;\n" +
                                    "document.write(sessionStorage.name);\n" +
                                    "</script>\n" +
                                    " 11. What is the full form of URI, URL, URN?\n" +
                                    "\n" +
                                    "URI - Uniform Resource Identifier \n" +
                                    "URL - Uniform Resource Locator \n" +
                                    "URN - Uniform Resource Name\n" +
                                    "\n" +
                                    "12. Write code for a html table that will have one row and one column?\n" +
                                    "\n" +
                                    "<table>\n" +
                                    "\n" +
                                    "     <tr>\n" +
                                    "\n" +
                                    "          <td>\n" +
                                    "\n" +
                                    "         </td>\n" +
                                    "\n" +
                                    "    </tr>\n" +
                                    "\n" +
                                    "</table>\n" +
                                    " \n" +
                                    "\n" +
                                    "13.Difference between GET and POST Metods\n" +
                                    "\n" +
                                    "Difference Between GET and POST methods \n" +
                                    "\n" +
                                    "GET: \n" +
                                    "1) Data is appended to the URL. \n" +
                                    "2) Data is not secret. \n" +
                                    "3) It is a single call system \n" +
                                    "4) Maximum data that can be sent is 256. \n" +
                                    "5) Data transmission is faster \n" +
                                    "6) This is the default method for many browsers \n" +
                                    "\n" +
                                    "POST: \n" +
                                    "1) Data is appended to the URL. \n" +
                                    "2) Data is Secret \n" +
                                    "3) It is a two call system. \n" +
                                    "4) There is no Limit on the amount of data.That is characters any amount of data can be sent. \n" +
                                    "5) Data transmission is comparatively slow. \n" +
                                    "6) No default and should be Explicitly specified.\n" +
                                    "\n" +
                                    "14.Why to specify the alt value in the img tag?\n" +
                                    "\n" +
                                    "alt stands for alternate this means that for some reason if image can't be loaded on the page, the alt value will be displayed.\n" +
                                    "\n" +
                                    "<img src=\"myimage.jpg\" alt=\"this is my photo\" title=\"click to go to my page\" />\n" +
                                    "\n" +
                                    "\n" +
                                    "In the above code snippet when myimage.jpg is available on the web server, the image will be displayed and mouse ever on the image will show \"click to go to my page\" but in case myimage.jpg is not available on the server or by some reason it could't be rendered on the page, alt value (this is my photo) will be displayed in place of image. This hints the user that the picture that couldn't be loaded was my photo.\n" +
                                    "\n" +
                                    "15. How to add javascript file reference in the web page?\n" +
                                    "\n" +
                                    "We can use <script> tag to refer the .js file available on the server, we can not only refer only those file that are on our server but we cal also any .js file that is available on other server (on other domain.\n" +
                                    "\n" +
                                    "<script src=\"/include/myjscode.js\" type=\"text/javascript\"></script>\n" +
                                    "\n" +
                                    "It is always suggested to place the script tag inside <head></head>\n" +
                                    "\n" +
                                    "16. How to display the web page icon in the browser?\n" +
                                    "\n" +
                                    "By placing the link tag inside the <head></head and specify rel value as \"shortcut icon\", you can display the page icon in the browser.\n" +
                                    "\n" +
                                    "<link rel=\"shortcut icon\" href=\"/images/myicon.gif\" />\n" +
                                    "\n" +
                                    "Here, you can either specify .gif, .jpg or .ico file, however many browser only support .ico file not .gif or .jpg file.\n" +
                                    "\n" +
                                    "17. How to refer the .css file in the web page?\n" +
                                    "\n" +
                                    " \n" +
                                    "To refer .css file in the web page, use <link> tag. Generally it is suggested to keep this inside the <head></head> tag.\n" +
                                    "\n" +
                                    "<link href=\"/css/mystyle.css\" type=\"text/css\" rel=\"stylesheet\" />\n" +
                                    "\n" +
                                    "Notice that the type attribute value should be \"text/css\" and rel attribute value should be \"stylesheet\".\n" +
                                    "\n" +
                                    "18. How to write bulleted point in HTML?\n" +
                                    "\n" +
                                    "To write bulleted point, use <li> under <ul> like following.\n" +
                                    "\n" +
                                    "    <ul>\n" +
                                    "\n" +
                                    "        <li>Point 1</li>\n" +
                                    "\n" +
                                    "        <li>Point 2</li>\n" +
                                    "\n" +
                                    "        <li>Point 3</li>\n" +
                                    "\n" +
                                    "    </ul>\n" +
                                    "\n" +
                                    "In this case Point 1, Point 2 and Point 3 will appear as bulleted point.\n" +
                                    "\n" +
                                    "19. How to display numbered list in HTML?\n" +
                                    "\n" +
                                    "To display numbered list, use <li> under <ol> tag like below\n" +
                                    "\n" +
                                    " <ol>\n" +
                                    "\n" +
                                    "     <li>Point 1</li>\n" +
                                    "\n" +
                                    "     <li>Point 2</li>\n" +
                                    "\n" +
                                    "  </ol>\n" +
                                    " \n" +
                                    "\n" +
                                    "20. How to create a DropDown list box?\n" +
                                    "\n" +
                                    "To create a dropdown list box in HTML, write following code\n" +
                                    "\n" +
                                    "  <select name=\"drop1\" id=\"drop1\">\n" +
                                    "\n" +
                                    "                    <option value=\"1\">item 1</option>\n" +
                                    "\n" +
                                    "                    <option value=\"2\">item 2</option>\n" +
                                    "\n" +
                                    "                    <option value=\"0\">All</option>\n" +
                                    "\n" +
                                    "  </select>\n" +
                                    "\n" +
                                    "This will create a dropdown with two list item \"item 1\" and \"item 2\".\n" +
                                    "\n" +
                                    "21. How to create a ListBox in HTML?\n" +
                                    "\n" +
                                    "To create a list box, write following code\n" +
                                    "\n" +
                                    "<select name=\"drop1\" id=\"Select1\" size=\"4\" multiple=\"multiple\">\n" +
                                    "\n" +
                                    "    <option value=\"1\">item 1</option>\n" +
                                    "\n" +
                                    "    <option value=\"2\">item 2</option>\n" +
                                    "\n" +
                                    "    <option value=\"3\">item 3</option>\n" +
                                    "\n" +
                                    "    <option value=\"4\">item 4</option>\n" +
                                    "\n" +
                                    "    <option value=\"0\">All</option>\n" +
                                    "\n" +
                                    "</select>\n" +
                                    " \n" +
                                    "This will create a listbox with 5 items. As multiple attribute value is specified as =\"multiple\" so it gives ability to select more than one item from the box by holding ctrl key or by dragging through items from the mouse.\n" +
                                    "\n" +
                                    "22. Should we use table tag to design the layout of the webpage?\n" +
                                    "\n" +
                                    "No, <table> tag is made for rendering the data in tabular format not to design the layout of the webpage, however this is massively used for the designer because its easy to use. \n" +
                                    "\n" +
                                    "To design the layout we should use <div> and/or <span> along with css classes.\n" +
                                    "\n" +
                                    "23. What is the code to write bulleted and numbered list in HTML.\n" +
                                    "\n" +
                                    "To write bulleted list in the HTML, write following code:\n" +
                                    "\n" +
                                    "<ul>\n" +
                                    "\n" +
                                    "  <li>fdasfadsf asdf</li>\n" +
                                    "\n" +
                                    "  <li>sfdafasdf</li>\n" +
                                    "\n" +
                                    "  <li>fdsafasfsa</li>\n" +
                                    "\n" +
                                    "  <li>fdsafsda</li>\n" +
                                    "\n" +
                                    "</ul>\n" +
                                    "To write numbered list in the HTML, write following code:\n" +
                                    "<ol>\n" +
                                    "\n" +
                                    "  <li>fdasfadsf asdf</li>\n" +
                                    "\n" +
                                    "  <li>sfdafasdf</li>\n" +
                                    "\n" +
                                    "  <li>fdsafasfsa</li>\n" +
                                    "\n" +
                                    "  <li>fdsafsda</li>\n" +
                                    "\n" +
                                    "</ol>\n" +
                                    "\n" +
                                    "\n" +
                                    "Notice the difference is only <ul> and <ol>. In the bulleted list, we need to use <ul> tag and in the numbered list we need to use <ol> tag.\n" +
                                    "\n" +
                                    "24. What is <!DOCTYPE> defines in HTML?\n" +
                                    "\n" +
                                    "Doctype defines as \"document type declaration\" (DTD). \n" +
                                    "\n" +
                                    "All HTML pages should contain a <!DOCTYPE> declaration to define which HTML version we are using in our page. it gives important instruction to web browser about page's HTML version type. It also allows web validator to check the syntax of page.\n" +
                                    "\n" +
                                    "25. How FontSize and Font Size is differ in HTML?\n" +
                                    "\n" +
                                    "font size is an attribute that we used in font tag. \n" +
                                    "Ex : <font size=\"5\"> use in font tag. \n" +
                                    "\n" +
                                    "Where as font-size is an style property used for controls. \n" +
                                    "Ex : Font-Size=\"Small\" use for style property For Controls.\n" +
                                    "\n" +
                                    "26. How to forbid autocomplete for a form ?\n" +
                                    "\n" +
                                    " \n" +
                                    "use autocomplete=\"off\"\n" +
                                    "\n" +
                                    "27. What is the user of alt property in <img> tag?\n" +
                                    "\n" +
                                    "The use of \"alt\" property of <img> tag is to display the alt value in case browser is unable to load the image so that the end user can understand what kind of image was actually there on the page that couldn't be loaded.\n" +
                                    "\n" +
                                    "28. What is the use of title property of <img> tag?\n" +
                                    "\n" +
                                    "The title property of <img> tag is used to describe about the image. The value of title property is displayed when the end user mouse over the image.\n" +
                                    "\n" +
                                    "29. What should be the href property value of anchor tag in case we want to handle the click event\n" +
                                    "\n" +
                                    "The href property of anchor tag should be \"javascript:void(0)\" when we want to handle the click event of the anchor tag. Many people keep href=\"#\" that jump the screen to top when the link is clicked.\n" +
                                    "\n" +
                                    "<a id=\"closeLink\"  href=\"javascript:void(0)\" onclick=\"Clicked()\" title=\"Whatever\">Whatever link</a>\n" +
                                    "\n" +
                                    "In other way we can also write like this\n" +
                                    "<a id=\"closeLink\"  href=\"javascript:Clicked()\" title=\"Whatever\">Whatever link</a>\n" +
                                    "30 What is SPA ?\n" +
                                    "\n" +
                                    "Single Page application(SPA) is a web application or web site that fits on a single web page which provides a more fluid UX akin to a desktop application by loading all necessary code (using HTML, JavaScript, and CSS) with single page Load.\n" +
                                    " ";
                            String site2 = "HTML5";

                            Intent intent = new Intent(v.getContext(), CSS.class);
                            intent.putExtra(SITE1_KEY, site1);
                            intent.putExtra(SITE2_KEY, site2);
                            startActivity(intent);
                    }
            });
        cssa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Processing", Toast.LENGTH_SHORT).show();

                String site1 = "CSS Interview Questions\n" +
                        "\n" +
                        "1. What is CSS ?\n" +
                        "\n" +
                        "The full form of CSS is Cascading Style Sheets. It is a styling language which is simple enough for HTML elements. It is popular in web designing, and its application is common in XHTML also.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "2. What is the origin of CSS ?\n" +
                        "\n" +
                        "Standard Generalized Markup Language marked the beginning of style sheets in 1980s.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "3. What are the different variations of CSS ? The variations for CSS are:\n" +
                        "\n" +
                        "·         CSS 1\n" +
                        "·         CSS 2\n" +
                        "·         CSS 2.1\n" +
                        "·         CSS 3\n" +
                        "·         CSS 4\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "4. What are the limitations of CSS ?\n" +
                        "\n" +
                        "Limitations are:\n" +
                        "\n" +
                        "·         Ascending by selectors is not possible\n" +
                        "·         Limitations of vertical control\n" +
                        "·         No expressions\n" +
                        "·         No column declaration\n" +
                        "·         Pseudo-class not controlled by dynamic behavior\n" +
                        "·         Rules, styles, targeting specific text not possible\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "5. What are the advantages of CSS ?\n" +
                        "\n" +
                        "Advantages are:\n" +
                        "\n" +
                        "·         Bandwidth\n" +
                        "·         Site-wide consistency\n" +
                        "·         Page reformatting\n" +
                        "·         Accessibility\n" +
                        "·         Content separated from presentation\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "6. What are CSS frameworks?\n" +
                        "\n" +
                        "It is a pre-planned libraries, which allows easier and more standards-compliant webpage styling, using CSS language.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "7. How block elements can be centered with CSS1?\n" +
                        "\n" +
                        "Block level elements can be centered by:\n" +
                        "\n" +
                        "The margin-left and margin-right properties can be set to some explicit value: [crayon-5460cae80689b084345899/]\n" +
                        "\n" +
                        "In this case, the left and right margins will be each, five ems wide since they split up the ten ems left over from (40em-30em). It was unnecessary for setting up an explicit width for the BODY element; it was done here for simplicity.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "8. Who maintains the CSS specifications?\n" +
                        "\n" +
                        "World Wide Web Consortium maintains the CSS specifications.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "9. In how many ways can a CSS be integrated as a web page?\n" +
                        "\n" +
                        "CSS can be integrated in three ways:\n" +
                        "\n" +
                        "Inline: Style attribute can be used to have CSS applied HTML elements. Embedded: The Head element can have a Style element within which the code can be placed. Linked/ Imported: CSS can be placed in an external file and linked via link element.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "10. What benefits and demerits do External Style Sheets have? Benefits:\n" +
                        "\n" +
                        "·         One file can be used to control multiple documents having different styles.\n" +
                        "·         Multiple HTML elements can have many documents, which can have classes.\n" +
                        "·         To group styles in composite situations, methods as selector and grouping are used.\n" +
                        "\n" +
                        "Demerits:\n" +
                        "\n" +
                        "·         Extra download is needed to import documents having style information.\n" +
                        "·         To render the document, the external style sheet should be loaded. Not practical for small style definitions.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "11. Discuss the merits and demerits of Embedded Style Sheets? Merits of Embedded Style Sheets:\n" +
                        "\n" +
                        "·         Multiple tag types can be created in a single document.\n" +
                        "·         Styles, in complex situations, can be applied by using Selector and Grouping methods.\n" +
                        "·         Extra download is unnecessary.\n" +
                        "·         Demerits of Embedded Style Sheets:\n" +
                        "·         Multiple documents cannot be controlled.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "12. What does CSS selector mean?\n" +
                        "\n" +
                        "A string equivalent of HTML elements by which declarations or a set of it, is declared and is a link that can be referred for linking HTML and Style sheet is CSS selector.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "13. Enlist the media types CSS allows?\n" +
                        "\n" +
                        "The design and customization of documents are rendered by media. By applying media control over the external style sheets, they can be retrieved and used by loading it from the network.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "14. Differentiate logical tags from physical tags?\n" +
                        "\n" +
                        "·         While physical tags are also referred to as presentational mark-up, logical tags are useless for appearances.\n" +
                        "·         Physical tags are newer versions while logical tags are old and concentrate on content.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "15. Differentiate Style Sheet concept from HTML?\n" +
                        "\n" +
                        "While HTML provides easy structure method, it lacks styling, unlike Style sheets. Moreover, style sheets have better browser capabilities and formatting options.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "16. Describe ‘ruleset’?\n" +
                        "\n" +
                        "Ruleset : Selectors can be attached to other selectors to be identified by ruleset.\n" +
                        "\n" +
                        "It has two parts:\n" +
                        "\n" +
                        "·         Selector, e.g. R and\n" +
                        "·         declaration {text-indent: 11pt}\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "17. Comment on the Case-sensitivity of CSS ?\n" +
                        "\n" +
                        "Although, there are no case-sensitivity of CSS, nevertheless font families, URL’s of images, etc is. Only when XML declarations along with XHTML DOCTYPE are being used on the page, CSS is case -sensitive.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "18. Define Declaration block?\n" +
                        "\n" +
                        "A catalog of directions within braces consisting of property, colon and value is called declaration block. e.g.: [property 1: value 3]\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "19. Enlist the various fonts’ attributes?\n" +
                        "\n" +
                        "They are:\n" +
                        "\n" +
                        "·         Font-style\n" +
                        "·         Font-variant\n" +
                        "·         Font-weight\n" +
                        "·         Font-size/line-height\n" +
                        "·         Font-family\n" +
                        "·         Caption\n" +
                        "·         Icon\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "20. Why is it easy to insert a file by importing it?\n" +
                        "\n" +
                        "Importing enables combining external sheets to be inserted in many sheets. Different files and sheets can be used to have different functions. Syntax:\n" +
                        "\n" +
                        "@import notation, used with tag.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "21. What is the usage of Class selector?\n" +
                        "\n" +
                        "Selectors that are unique to a specific style, are called CLASS selectors. Declaration of style and association with HTML can be made through this. Syntax:\n" +
                        "\n" +
                        "Classname it can be A-Z, a-z or digits. .top {font: 14em ;}, class selector this class is associated with element\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "22. Differentiate Class selector from ID selector?\n" +
                        "\n" +
                        "While an overall block is given to class selector, ID selector prefers only a single element differing   from other elements.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "23. Can more than one declaration be added in CSS?\n" +
                        "\n" +
                        "Yes, it can be achieved by using a semicolon.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "24. What is Pseudo-elements ?\n" +
                        "\n" +
                        "Pseudo-elements are used to add special effects to some selectors.  CSS in used to apply styles in HTML mark-up. In some cases when extra mark-up or styling is not possible for the document, then there is a feature available in CSS known as pseudo-elements. It will allow extra mark-up to the document without disturbing the actual document.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "25. How to overrule underlining Hyperlinks?\n" +
                        "\n" +
                        "Control statements and external style sheets are used to overrule underlining Hyperlinks.\n" +
                        "\n" +
                        "E.g.: [crayon-5460cae8068b7974642950/]\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "26. What happens if 100% width is used along with floats all across the page?\n" +
                        "\n" +
                        "While making the float declaration, 1 pixel is added every time it is used in the form of the border, and   even more float is allowed thereafter.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "27. Can default property value be restored through CSS? If yes, how?\n" +
                        "\n" +
                        "In CSS, you cannot revert back to old values due to lack of default values. The property can be re- declared to get the default property.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "28. Enlist the various Media types used?\n" +
                        "\n" +
                        "Different media has different properties as they are case insensitive.\n" +
                        "\n" +
                        "They are:\n" +
                        "\n" +
                        "·         Aural – for sound synthesizers and speech\n" +
                        "·         Print – gives a preview of the content when printed\n" +
                        "·         Projection- projects the CSS on projectors.\n" +
                        "·         Handheld- uses handheld devices.\n" +
                        "·         Screen- computers and laptop screens.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "29. What is CSS Box Model and what are its elements?\n" +
                        "\n" +
                        "This box defines design and layout of elements of CSS. The elements are:\n" +
                        "\n" +
                        "Margin: the top most layer, the overall structure is shown\n" +
                        "\n" +
                        "Border: the padding and content option with a border around it is shown.  Background color affects the border. Padding: Space is shown. Background colour affects the border. Content: Actual content is shown.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "30. What is contextual selector?\n" +
                        "\n" +
                        "Selector used to select special occurrences of an element is called contextual selector. A space separates the individual selectors. Only the last element of the pattern is addressed in this kind of selector. For e.g.: TD P TEXT {color: blue}\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "31. Compare RGB values with Hexadecimal color codes ?\n" +
                        "\n" +
                        "A color can be specified in two ways:\n" +
                        "\n" +
                        "A color is represented by 6 characters i.e. hexadecimal color coding. It is a combination of numbers and letters and is preceded by #.       e.g.: g {color: #00cjfi} A color is represented by a mixture of red, green and blue. The value of a color can also be specified. e.g.: rgb(r,g,b): In this type the values can be in between the integers 0 and 255. rgb(r%,g%,b%):  red, green and blue percentage is shown.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "32. Define Image sprites with context to CSS ?\n" +
                        "\n" +
                        "When a set of images is collaborated into one image, it is known as ‘Image Sprites’. As the loading every image on a webpage consumes time, using image sprites lessens the time taken and gives information quickly.\n" +
                        "\n" +
                        "CSS coding: [crayon-5460cae8068bc878378483/]\n" +
                        "\n" +
                        "In this case, only the part needed is used. The user can save substantial margin and time through this.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "33. Compare Grouping and Nesting in CSS ?\n" +
                        "\n" +
                        "Grouping:  Selectors can be grouped having the same values of property and the code be reduced. E.g. : [crayon-5460cae8068bf030848873/]\n" +
                        "\n" +
                        "It can be seen from the code that every element shares the same property. Rewriting can be avoided by writing each selector separated by a comma.\n" +
                        "\n" +
                        "Nesting: Specifying a selector within a selector is called nesting.\n" +
                        "\n" +
                        " [crayon-5460cae8068c1376820860/]\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "34. How can the dimension be defined of an element ?\n" +
                        "\n" +
                        "Dimension properties can be defined by:\n" +
                        "\n" +
                        "·         Height\n" +
                        "·         Max-height\n" +
                        "·         Max-width\n" +
                        "·         Min-height\n" +
                        "·         Min-width\n" +
                        "·         Width\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "35. Define float property of CSS?\n" +
                        "\n" +
                        "By float property, the image can be moved to the right or the left along with the text to be wrapped around it. Elements before this property is applied do not change their properties.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "36. How does Z index function?\n" +
                        "\n" +
                        "Overlapping may occur while using CSS for positioning HTML elements. Z index helps in specifying the overlapping element. It is a number which can be positive or negative, the default value being zero.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "37. What is graceful degradation?\n" +
                        "\n" +
                        "In case the component fails, it will continue to work properly in the presence of a graceful degradation. The latest browser application is used when a webpage is designed. As it is not available to everyone, there is a basic functionality, which enables its use to a wider audience. In case the image is unavailable for viewing, text is shown with the alt tag.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "38. What is progressive enhancement?\n" +
                        "\n" +
                        "It’s an alternative to graceful degradation, which concentrates on the matter of the web. The functionality is same, but it provides an extra edge to users having the latest bandwidth. It has been into prominent use recently with mobile internet connections expanding their base.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "39. How can backward compatibility be designed in CSS?\n" +
                        "\n" +
                        "HTML sheet methods is collaborated with CSS and used accordingly.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "40. How can the gap under the image be removed?\n" +
                        "\n" +
                        "As images being inline elements are treated same as texts, so there is a gap left, which can be  removed by:\n" +
                        "\n" +
                        "CSS [crayon-5460cae8068c4614526284/]\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "41. Why is @import only at the top?\n" +
                        "\n" +
                        "@import is preferred only at the top, to avoid any overriding rules. Generally, ranking order is followed in most programming languages such as Java, Modula, etc. In C, the # is a prominent example of a @import being at the top.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "42. Which among the following is more precedent: CSS properties or HTML procedures?\n" +
                        "\n" +
                        "CSS is more precedent over HTML procedures. Browsers, which do not have CSS support, display HTML attributes.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "43. What is Inline style?\n" +
                        "\n" +
                        "The Inline style in a CSS is used to add up styling to individual HTML elements.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "44.  How comments can be added in CSS?\n" +
                        "\n" +
                        "The comments in CSS can be added with /* and */.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "45. Define Attribute Selector ?\n" +
                        "\n" +
                        "It is defined by a set of elements, value and its parts.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "46. Define property?\n" +
                        "\n" +
                        "A style, that helps in influencing CSS. E.g. FONT. They have corresponding values or properties within them, like FONT has different style like bold, italic etc.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "47.  What is Alternate Style Sheet?\n" +
                        "\n" +
                        "Alternate Style Sheets allows the user to select the style in which the page is displayed using the view>page style menu. Through Alternate Style Sheet, user can see a multiple version of the page on their needs and preferences.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "48. Are quotes mandatory in URL’s?\n" +
                        "\n" +
                        "Quotes are optional in URL’s, and it can be single or double.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "49. What is at-rule?\n" +
                        "\n" +
                        "Rule, which is applicable in the entire sheet and not partly, is known as at-rule. It is preceded by @ followed by A-Z, a-z or 0-9.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "50. How can CSS be cascaded to mix with user’s personal sheet?\n" +
                        "\n" +
                        "Properties can be a set in recommended places and the document modified for CSS to mix with user’s   personal sheet.\n" +
                        "\n" +
                        " ";
                String site2 = "CSS";

                Intent intent = new Intent(v.getContext(), CSS.class);
                intent.putExtra(SITE1_KEY, site1);
                intent.putExtra(SITE2_KEY, site2);
                startActivity(intent);
            }
        });

        css3 = (Button)findViewById(R.id.css_three);
        css3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Processing", Toast.LENGTH_SHORT).show();

                String site1 = "CSS3 Interview Questions\n" +
                        "1. How to write conditional statement in CSS?\n" +
                        "\n" +
                        "\n" +
                        "Following is the example of conditional statement in CSS.\n" +
                        "\n" +
                        " <head>\n" +
                        "\n" +
                        "        <style type=\"text/css\">\n" +
                        "\n" +
                        "           body\n" +
                        "\n" +
                        "            {\n" +
                        "\n" +
                        "                color:blue;\n" +
                        "\n" +
                        "            }\n" +
                        "\n" +
                        "        </style>\n" +
                        "\n" +
                        "        <!--[if IE 7]>\n" +
                        "\n" +
                        "        <style type=\"text/css\">\n" +
                        "\n" +
                        "        body {\n" +
                        "\n" +
                        "            background-color:red;\n" +
                        "\n" +
                        "        }\n" +
                        "\n" +
                        "        </style>\n" +
                        "\n" +
                        "        <![endif]-->\n" +
                        "\n" +
                        " </head>\n" +
                        "\n" +
                        "\n" +
                        "If this code will run in IE7 browser, the background color of the page will be red, for other browser it will be default color (white).\n" +
                        "\n" +
                        "2. How to write styles for all html elements of the same type?\n" +
                        "\n" +
                        "If we want to maintain uniformity in the look and feel of all same type of elements on the page, we can write CSS class with the element name.eg. \n" +
                        "\n" +
                        "If we want to change the look and feel of all table and h1 element on the page, we can write like this.\n" +
                        "table\n" +
                        "\n" +
                        "{\n" +
                        "\n" +
                        "                    font-size:10pt;\n" +
                        "\n" +
                        "        font-family: Arial;\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "h1\n" +
                        "\n" +
                        "{\n" +
                        "\n" +
                        "    font-size:14pt;\n" +
                        "\n" +
                        "    padding-left:5px;\n" +
                        "\n" +
                        "    margin:0px;\n" +
                        "\n" +
                        "    color:#094BBB;\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "\n" +
                        "The first class \"table\" will apply to all the tables on the page and second class \"h1\" will apply to all the h1 element of the page. \n" +
                        "\n" +
                        "Note that the name of the class is not prefixed with the . (dot) as it happens with normal css class name.\n" +
                        "3. What are the possible values of the \"Position\" attributes?\n" +
                        "\n" +
                        "The possible value of the \"Position\" attributes are \n" +
                        "\n" +
                        "absolute \n" +
                        "fixed \n" +
                        "inherit \n" +
                        "relative \n" +
                        "static \n" +
                        "\n" +
                        "By default, relative value is considered.\n" +
                        "4. How to display a link without underline and display underline when mouseover on the link using CSS?\n" +
                        "\n" +
                        "Write following css class.\n" +
                        "a\n" +
                        "\n" +
                        "{\n" +
                        "\n" +
                        "    text-decoration:none;\n" +
                        "\n" +
                        "}\n" +
                        "a:hover\n" +
                        "\n" +
                        "{\n" +
                        "\n" +
                        "    text-decoration:underline;\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "\n" +
                        "The first class will force all anchor tag (link)to not display any docoration (underline) and second class will force all anchor tag (link) to display text decoration as underline when mouse over it (ie. display underline when mouse over).\n" +
                        "\n" +
                        "5. How to float the image left side and let the page content fill right side and bottom in CSS?\n" +
                        " \n" +
                        "\n" +
                        "Wrap the div element with fload:left style.\n" +
                        "\n" +
                        "<div style=\"float: left\">\n" +
                        "\n" +
                        "<img src=\"fsdaf.gif\" />Your contents goes here.\n" +
                        "\n" +
                        "</div>\n" +
                        "\n" +
                        "\n" +
                        "To reverse, ie float the image in the right side and let the content fill the space at the left and further down, specify float:right style.\n" +
                        "\n" +
                        "6. How to line break in CSS?\n" +
                        "\n" +
                        "Use display:block style with span.\n" +
                        "<span style=\"display:block;\" />\n" +
                        "7. How to page break after an html element in CSS?\n" +
                        "\n" +
                        "Use following code snippet\n" +
                        "<p style=\"page-break-after: always\">Place your text</p>\n" +
                        "\n" +
                        "\n" +
                        "After above code, the rest content will appear in the next page. (It will not be visible as next page in browser but on the printer and in Print Preview, you will see them as next page)\n" +
                        "\n" +
                        "8. State some limitations of style sheets?\n" +
                        "\n" +
                        "Style sheets do have its own share of limitations some of them are as follows: - \n" +
                        "1) Inconsistent browser support \n" +
                        "2) Vertical control limitations \n" +
                        "3) Margin collapsing, float containment, control of element shapes, etc \n" +
                        "4) Lack of column declaration and variables are some of the limitations present in CSS.\n" +
                        "\n" +
                        "9. How do I center block-elements with CSS1?\n" +
                        "\n" +
                        "There are two ways of centering block level elements: \n" +
                        "\n" +
                        "1. By setting the properties margin-left and margin-right to auto and width to some explicit value: \n" +
                        "\n" +
                        "BODY {width: 30em; background: cyan;} \n" +
                        "P {width: 22em; margin-left: auto; margin-right: auto} \n" +
                        "\n" +
                        "In this case, the left and right margins will each be four ems wide, since they equally split up the eight ems left over from (30em - 22em). Note that it was not necessary to set an explicit width for the BODY element; it was done here to keep the math clean. \n" +
                        "\n" +
                        "Another example: \n" +
                        "\n" +
                        "TABLE {margin-left: auto; margin-right: auto; width: 400px;} \n" +
                        "In most legacy browsers, a table's width is by default determined by its content. In CSS-conformant browsers, the complete width of any element (including tables) defaults to the full width of its parent element's content area. As browser become more conformant, authors will need to be aware of the potential impact on their designs.\n" +
                        "\n" +
                        "10. What does CSS stand for?\n" +
                        "\n" +
                        "NOTE: This is objective type question, Please click question title for correct answer.\n" +
                        "\n" +
                        "11. Explain inline, embedded and external style sheets .\n" +
                        "\n" +
                        "There are three ways of inserting a style sheet: \n" +
                        "\n" +
                        "1. External style sheet \n" +
                        "2. Internal style sheet \n" +
                        "3. Inline style \n" +
                        "\n" +
                        "External Style Sheet : \n" +
                        "An external style sheet is ideal when the style is applied to many pages. \n" +
                        "With an external style sheet, you can change the look of an entire Web site by changing one file. \n" +
                        "Each page must link to the style sheet using the <link> tag. The <link> tag goes inside the head section: \n" +
                        "<head> \n" +
                        "<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\" /> \n" +
                        "</head> \n" +
                        "\n" +
                        "Internal Style Sheet : \n" +
                        "An internal style sheet should be used when a single document has a unique style. Internal styles sheet needs to put in the head section of an HTML page, by using the <style> tag, like this: \n" +
                        "<head> \n" +
                        "<style type=\"text/css\"> \n" +
                        "hr {color:sienna} \n" +
                        "p {margin-left:20px} \n" +
                        "body {background-image:url(\"images/back40.gif\")} \n" +
                        "</style> \n" +
                        "</head> \n" +
                        "\n" +
                        "Inline Styles : \n" +
                        "If only a small piece of code has to be styled then inline style sheets can be used. \n" +
                        "An inline style loses many of the advantages of style sheets by mixing content with presentation. \n" +
                        "To use inline styles you use the style attribute in the relevant tag. \n" +
                        "The style attribute can contain any CSS property. \n" +
                        "The example shows how to change the color and the left margin of a paragraph: \n" +
                        "<p style=\"color:sienna;margin-left:20px\">This is a paragraph.</p>\n" +
                        "\n" +
                        "12. What are the values of \"Position\" attribute in CSS?\n" +
                        "\n" +
                        "Possible values are \n" +
                        "static, relative, absolute, fixed, inherit\n" +
                        "\n" +
                        "13. What is the default value of \"position\" attribute in css?\n" +
                        "\n" +
                        "Default value is \"static\".\n" +
                        "\n" +
                        "Display and visibility properties are used to hide and show elements in any page. Then how they are different from each other?\n" +
                        "\n" +
                        "As said Both the properties are used to hide and show elements but they are different in the way they both work. visibility property, set to hidden will still occupy the space in the layout but display:none does not take up the space in the page.\n" +
                        "\n" +
                        "14. Can you specify more than one css class for any HTML element?\n" +
                        "\n" +
                        "Yes, you can. Just provide a space between both the class names. \n" +
                        "\n" +
                        "like..\n" +
                        "\n" +
                        "<div class=\"class1 class2\">\n" +
                        "\n" +
                        "</div>\n" +
                        " \n" +
                        "\n" +
                        "15. What is the difference between specifying css class with # and .? i.e. #Class1 or .Class1?\n" +
                        "\n" +
                        "Stylesheeet class declared with # applies to items which have same Id value as of the class name. \n" +
                        "\n" +
                        "like\n" +
                        "\n" +
                        "#div1\n" +
                        "\n" +
                        "{\n" +
                        "\n" +
                        "   font-weight:bold;\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "<div id=\"div1\">Styled Container</div>\n" +
                        "\n" +
                        "Where css class declared with . can be used for any html element.\n" +
                        "\n" +
                        ".class1\n" +
                        "\n" +
                        "      {\n" +
                        "\n" +
                        "         position:relative;\n" +
                        "\n" +
                        "         left:50px;\n" +
                        "\n" +
                        "      }\n" +
                        "<div class=\"class1\">Styled Container</div>\n" +
                        "\n" +
                        "Cascading Style Sheets (CSS) is not case sensitve. However, font families, URLs to images, and other direct references with the style sheet may be. \n" +
                        "\n" +
                        "If your page uses an XML declaration and an XHTML DOCTYPE then the CSS selectors will be case-sensitive for some browsers, if your page uses a HTML DOCTYPE then your CSS selectors will be case-insensitive. \n" +
                        "\n" +
                        "It is a good idea to avoid naming classes where the only difference is the case, for example: \n" +
                        "div.myclass { ...} \n" +
                        "div.myClass { ... }\n" +
                        "\n" +
                        "16. What is embedded style? How to link?\n" +
                        "\n" +
                        "The HEAD area, where the TITLE and META tags are found, is also used to store CSS commands. \n" +
                        "These are called embedded CSS. Any embedded CSS command will over-ride an external CSS command of the same tag. Embedded commands are more specific to the page. \n" +
                        "\n" +
                        "Embedded CSS codes are placed within the HEAD area of the page code. That is anywhere after the <HEAD> tag and before the </HEAD> tag. NOT in the HEAD tag itself. \n" +
                        "\n" +
                        "<style type=\"text/css\" media=screen> \n" +
                        "<!-- \n" +
                        "p {font-family: georgia, serif; font-size: x-small;} \n" +
                        "hr {color: #ff9900; height: 1px } \n" +
                        "a:hover {color: #ff0000; text-decoration: none} \n" +
                        "--> \n" +
                        "</style> \n" +
                        "\n" +
                        "Now, whenever any of those elements are used within the body of the document, they will be formatted as instructed in the above style sheet.\n" +
                        "\n" +
                        "17. What is CSS rule 'ruleset'?\n" +
                        "\n" +
                        "There are two types of CSS rules: ruleset and at-rule. Ruleset identifies selector or selectors and declares style which is to be attached to that selector or selectors. For example P {text-indent: 10pt} is a CSS rule. CSS rulesets consist of two parts: selector, e.g. P and declaration, e.g. {text-indent: 10pt}. \n" +
                        "\n" +
                        "P {text-indent: 10pt} - CSS rule (ruleset) \n" +
                        "{text-indent: 10pt} - CSS declaration \n" +
                        "text-indent - CSS property \n" +
                        "10pt - CSS value\n" +
                        "\n" +
                        "18. What is ID selector?\n" +
                        "\n" +
                        "ID selector is an individually identified (named) selector to which a specific style is declared. Using the ID attribute the declared style can then be associated with one and only one HTML element per document as to differentiate it from all other elements. ID selectors are created by a character # followed by the selector's name. The name can contain characters a-z, A-Z, digits 0-9, period, hyphen, escaped characters, Unicode characters 161-255, as well as any Unicode character as a numeric code, however, they cannot start with a dash or a digit. \n" +
                        "\n" +
                        "#abc123 {color: red; background: black} \n" +
                        "\n" +
                        "<P ID=abc123>This and only this element can be identified as abc123 </P>\n" +
                        "19. How to write conditional statement in CSS?\n" +
                        "\n" +
                        "Following is the example of conditional statement in CSS.\n" +
                        "\n" +
                        " <head>\n" +
                        "\n" +
                        "        <style type=\"text/css\">\n" +
                        "\n" +
                        "           body\n" +
                        "\n" +
                        "            {\n" +
                        "\n" +
                        "                color:blue;\n" +
                        "\n" +
                        "            }\n" +
                        "\n" +
                        "        </style>\n" +
                        "\n" +
                        "        <!--[if IE 7]>\n" +
                        "\n" +
                        "        <style type=\"text/css\">\n" +
                        "\n" +
                        "        body {\n" +
                        "\n" +
                        "            background-color:red;\n" +
                        "\n" +
                        "        }\n" +
                        "\n" +
                        "        </style>\n" +
                        "\n" +
                        "        <![endif]-->\n" +
                        "\n" +
                        " </head>\n" +
                        "\n" +
                        "\n" +
                        "If this code will run in IE7 browser, the background color of the page will be red, for other browser it will be default color (white).\n" +
                        "\n" +
                        "20. How to write styles for all html elements of the same type?\n" +
                        "\n" +
                        "If we want to maintain uniformity in the look and feel of all same type of elements on the page, we can write CSS class with the element name.eg. \n" +
                        "\n" +
                        "If we want to change the look and feel of all table and h1 element on the page, we can write like this.\n" +
                        "\n" +
                        "table\n" +
                        "\n" +
                        "{\n" +
                        "\n" +
                        "                    font-size:10pt;\n" +
                        "\n" +
                        "        font-family: Arial;\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "h1\n" +
                        "\n" +
                        "{\n" +
                        "\n" +
                        "    font-size:14pt;\n" +
                        "\n" +
                        "    padding-left:5px;\n" +
                        "\n" +
                        "    margin:0px;\n" +
                        "\n" +
                        "    color:#094BBB;\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "The first class \"table\" will apply to all the tables on the page and second class \"h1\" will apply to all the h1 element of the page. \n" +
                        "\n" +
                        "Note that the name of the class is not prefixed with the . (dot) as it happens with normal css class name.\n" +
                        "21. What are the possible values of the \"Position\" attributes?\n" +
                        "\n" +
                        "The possible value of the \"Position\" attributes are \n" +
                        "\n" +
                        "absolute \n" +
                        "fixed \n" +
                        "inherit \n" +
                        "relative \n" +
                        "static \n" +
                        "\n" +
                        "By default, relative value is considered.\n" +
                        "\n" +
                        "22. How to display a link without underline and display underline when mouseover on the link using CSS?\n" +
                        "\n" +
                        "Write following css class.\n" +
                        "\n" +
                        "a\n" +
                        "\n" +
                        "{\n" +
                        "\n" +
                        "    text-decoration:none;\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "a:hover\n" +
                        "\n" +
                        "{\n" +
                        "\n" +
                        "    text-decoration:underline;\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "\n" +
                        "The first class will force all anchor tag (link)to not display any docoration (underline) and second class will force all anchor tag (link) to display text decoration as underline when mouse over it (ie. display underline when mouse over).\n" +
                        "\n" +
                        "23. How to float the image left side and let the page content fill right side and bottom in CSS?\n" +
                        "\n" +
                        "Wrap the div element with fload:left style.\n" +
                        "\n" +
                        "<div style=\"float: left\">\n" +
                        "\n" +
                        "<img src=\"fsdaf.gif\" />Your contents goes here.\n" +
                        "\n" +
                        "</div>\n" +
                        "\n" +
                        "\n" +
                        "To reverse, ie float the image in the right side and let the content fill the space at the left and further down, specify float:right style.\n" +
                        "\n" +
                        "24. How to line break in CSS?\n" +
                        "\n" +
                        "Use display:block style with span.\n" +
                        "\n" +
                        "<span style=\"display:block;\" />\n" +
                        " \n" +
                        "\n" +
                        "25. How to page break after an html element in CSS?\n" +
                        "\n" +
                        "Use following code snippet\n" +
                        "\n" +
                        "<p style=\"page-break-after: always\">Place your text</p>\n" +
                        "\n" +
                        "\n" +
                        "After above code, the rest content will appear in the next page. (It will not be visible as next page in browser but on the printer and in Print Preview, you will see them as next page)\n" +
                        "\n" +
                        "26. State some limitations of style sheets?\n" +
                        "\n" +
                        "Style sheets do have its own share of limitations some of them are as follows: - \n" +
                        "1) Inconsistent browser support \n" +
                        "2) Vertical control limitations \n" +
                        "3) Margin collapsing, float containment, control of element shapes, etc \n" +
                        "4) Lack of column declaration and variables are some of the limitations present in CSS.\n" +
                        "\n" +
                        "27. How do I center block-elements with CSS1?\n" +
                        "\n" +
                        "There are two ways of centering block level elements: \n" +
                        "\n" +
                        "1. By setting the properties margin-left and margin-right to auto and width to some explicit value: \n" +
                        "\n" +
                        "BODY {width: 30em; background: cyan;} \n" +
                        "P {width: 22em; margin-left: auto; margin-right: auto} \n" +
                        "\n" +
                        "In this case, the left and right margins will each be four ems wide, since they equally split up the eight ems left over from (30em - 22em). Note that it was not necessary to set an explicit width for the BODY element; it was done here to keep the math clean. \n" +
                        "\n" +
                        "Another example: \n" +
                        "\n" +
                        "TABLE {margin-left: auto; margin-right: auto; width: 400px;} \n" +
                        "In most legacy browsers, a table's width is by default determined by its content. In CSS-conformant browsers, the complete width of any element (including tables) defaults to the full width of its parent element's content area. As browser become more conformant, authors will need to be aware of the potential impact on their designs.\n" +
                        "\n" +
                        "28. What does CSS stand for?\n" +
                        "\n" +
                        "NOTE: This is objective type question, Please click question title for correct answer.\n" +
                        "\n" +
                        "29. Explain inline, embedded and external style sheets .\n" +
                        "\n" +
                        "There are three ways of inserting a style sheet: \n" +
                        "\n" +
                        "1. External style sheet \n" +
                        "2. Internal style sheet \n" +
                        "3. Inline style \n" +
                        "\n" +
                        "External Style Sheet : \n" +
                        "An external style sheet is ideal when the style is applied to many pages. \n" +
                        "With an external style sheet, you can change the look of an entire Web site by changing one file. \n" +
                        "Each page must link to the style sheet using the <link> tag. The <link> tag goes inside the head section: \n" +
                        "<head> \n" +
                        "<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\" /> \n" +
                        "</head> \n" +
                        "\n" +
                        "Internal Style Sheet : \n" +
                        "An internal style sheet should be used when a single document has a unique style. Internal styles sheet needs to put in the head section of an HTML page, by using the <style> tag, like this: \n" +
                        "<head> \n" +
                        "<style type=\"text/css\"> \n" +
                        "hr {color:sienna} \n" +
                        "p {margin-left:20px} \n" +
                        "body {background-image:url(\"images/back40.gif\")} \n" +
                        "</style> \n" +
                        "</head> \n" +
                        "\n" +
                        "Inline Styles : \n" +
                        "If only a small piece of code has to be styled then inline style sheets can be used. \n" +
                        "An inline style loses many of the advantages of style sheets by mixing content with presentation. \n" +
                        "To use inline styles you use the style attribute in the relevant tag. \n" +
                        "The style attribute can contain any CSS property. \n" +
                        "The example shows how to change the color and the left margin of a paragraph: \n" +
                        "<p style=\"color:sienna;margin-left:20px\">This is a paragraph.</p>\n" +
                        "\n" +
                        "What are the values of \"Position\" attribute in CSS?\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Possible values are \n" +
                        "static, relative, absolute, fixed, inherit\n" +
                        "\n" +
                        "30. What is the default value of \"position\" attribute in css?\n" +
                        "\n" +
                        "Default value is \"static\".\n" +
                        "\n" +
                        "Display and visibility properties are used to hide and show elements in any page. Then how they are different from each other?\n" +
                        "\n" +
                        "\n" +
                        "As said Both the properties are used to hide and show elements but they are different in the way they both work. visibility property, set to hidden will still occupy the space in the layout but display:none does not take up the space in the page.\n" +
                        "\n" +
                        "31. Can you specify more than one css class for any HTML element?\n" +
                        "\n" +
                        "Yes, you can. Just provide a space between both the class names. \n" +
                        "\n" +
                        "like..\n" +
                        "\n" +
                        "<div class=\"class1 class2\">\n" +
                        "\n" +
                        "</div>\n" +
                        " \n" +
                        "\n" +
                        "32. What is the difference between specifying css class with # and .? i.e. #Class1 or .Class1?\n" +
                        "\n" +
                        "Stylesheeet class declared with # applies to items which have same Id value as of the class name. \n" +
                        "\n" +
                        "like\n" +
                        "\n" +
                        "#div1\n" +
                        "\n" +
                        "{\n" +
                        "\n" +
                        "   font-weight:bold;\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "<div id=\"div1\">Styled Container</div>\n" +
                        "\n" +
                        "Where css class declared with . can be used for any html element.\n" +
                        "\n" +
                        ".class1\n" +
                        "\n" +
                        "      {\n" +
                        "\n" +
                        "         position:relative;\n" +
                        "\n" +
                        "         left:50px;\n" +
                        "\n" +
                        "      }\n" +
                        "\n" +
                        "<div class=\"class1\">Styled Container</div>\n" +
                        "Cascading Style Sheets (CSS) is not case sensitve. However, font families, URLs to images, and other direct references with the style sheet may be. \n" +
                        "\n" +
                        "If your page uses an XML declaration and an XHTML DOCTYPE then the CSS selectors will be case-sensitive for some browsers, if your page uses a HTML DOCTYPE then your CSS selectors will be case-insensitive. \n" +
                        "\n" +
                        "It is a good idea to avoid naming classes where the only difference is the case, for example: \n" +
                        "div.myclass { ...} \n" +
                        "div.myClass { ... }\n" +
                        "\n" +
                        "33. What is embedded style? How to link?\n" +
                        "\n" +
                        "The HEAD area, where the TITLE and META tags are found, is also used to store CSS commands. \n" +
                        "These are called embedded CSS. Any embedded CSS command will over-ride an external CSS command of the same tag. Embedded commands are more specific to the page. \n" +
                        "\n" +
                        "Embedded CSS codes are placed within the HEAD area of the page code. That is anywhere after the <HEAD> tag and before the </HEAD> tag. NOT in the HEAD tag itself. \n" +
                        "\n" +
                        "<style type=\"text/css\" media=screen> \n" +
                        "<!-- \n" +
                        "p {font-family: georgia, serif; font-size: x-small;} \n" +
                        "hr {color: #ff9900; height: 1px } \n" +
                        "a:hover {color: #ff0000; text-decoration: none} \n" +
                        "--> \n" +
                        "</style> \n" +
                        "\n" +
                        "Now, whenever any of those elements are used within the body of the document, they will be formatted as instructed in the above style sheet.\n" +
                        "\n" +
                        "34. What is CSS rule 'ruleset'?\n" +
                        "\n" +
                        "There are two types of CSS rules: ruleset and at-rule. Ruleset identifies selector or selectors and declares style which is to be attached to that selector or selectors. For example P {text-indent: 10pt} is a CSS rule. CSS rulesets consist of two parts: selector, e.g. P and declaration, e.g. {text-indent: 10pt}. \n" +
                        "\n" +
                        "P {text-indent: 10pt} - CSS rule (ruleset) \n" +
                        "{text-indent: 10pt} - CSS declaration \n" +
                        "text-indent - CSS property \n" +
                        "10pt - CSS value\n" +
                        "\n";
                String site2 = "CSS3";

                Intent intent = new Intent(v.getContext(), CSS.class);
                intent.putExtra(SITE1_KEY, site1);
                intent.putExtra(SITE2_KEY, site2);
                startActivity(intent);
            }
        });

        htmla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Processing", Toast.LENGTH_SHORT).show();

                String site1 = "HTML Interview Questions\n" +
                        "\n" +
                        "1) What is HTML?\n" +
                        "\n" +
                        "HTML is short for HyperText Markup Language, and is the language of the World Wide Web. It is the standard text formatting language used for creating and displaying pages on the Web. HTML documents are made up of two things: the content and the tags that formats it for proper display on pages.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "2) What are tags?\n" +
                        "\n" +
                        "Content is placed in between HTML tags 0in order to properly format it. It makes use of the less than symbol (). A slash symbol is also used as a closing tag. For example: [crayon-5460b56aaa96e528239727/]\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "3) Do all HTML tags come in pair?\n" +
                        "\n" +
                        "No, there are single HTML tags that does not need a closing tag. Examples are the\n" +
                        "\n" +
                        "tag and tags.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "4) What are some of the common lists that can be used when designing a page?\n" +
                        "\n" +
                        "You can insert any or a combination of the following list types:\n" +
                        "\n" +
                        "-          ordered list\n" +
                        "-          unordered list\n" +
                        "-          definition list\n" +
                        "-          menu list\n" +
                        "-          directory list Each of this list types makes use of a different tag set to compose\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "5) How do you insert a comment in html?\n" +
                        "\n" +
                        "Comments in html begins with “”. For example: [crayon-5460b56aaa976937045998/]\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "6) Do all character entities display properly on all systems?\n" +
                        "\n" +
                        "No, there are some character entities that cannot be displayed when the operating system that the browser is running on does not support the characters. When that happens, these characters are displayed as boxes.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "7) What is image map?\n" +
                        "\n" +
                        "Image map lets you link to many different web pages using a single image. You can define shapes in images that you want to make part of an image mapping.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "8 ) What is the advantage of collapsing white space?\n" +
                        "\n" +
                        "White spaces are blank sequence of space characters, which is actually treated as a single space character in html. Because the browser collapses multiple space into a single space, you can indent lines of text without worrying about multiple spaces. This enables you to organize the html code into a much more readable format.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "9) Can attribute values be set to anything or are there specific values that they accept?\n" +
                        "\n" +
                        "Some attribute values can be set to only predefined values. Other attributes can accept any numerical value that represents the number of pixels for a size.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "10) How do you insert a copyright symbol on a browser page?\n" +
                        "\n" +
                        "To insert the copyright symbol, you need to type © or & #169; in an HTML file.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "11) How do you create links to sections within the same page?\n" +
                        "\n" +
                        "Links can be created using the  tag, with referencing through the use of the number (#) symbol. For example, you can have one line as BACK TO TOP, which would result in the words “BACK TO TOP” appearing on the webpage and links to a bookmark named topmost. You then create a separate tag command like  somewhere on the top of the same webpage so that the user will be linked to that spot when he clicked on “BACK TO TOP”.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "12) Is there any way to keep list elements straight in an html file?\n" +
                        "\n" +
                        "By using indents, you can keep the list elements straight. If you indent each subnested list in further than the parent list that contains it, you can at a glance determine the various lists and the elements that it contains.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "13) If you see a web address on a magazine, to which web page does it point?\n" +
                        "\n" +
                        "Every web page on the web can have a separate web address. Most of these addresses are relative to the top-most web page. The published web address that appears within magazines typically points this top-most page. From this top level page, you can access all other pages within the web site.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "14) What is the use of using alternative text in image mapping?\n" +
                        "\n" +
                        "When you use image maps, it can easily become confusing and difficult to determine which hotspots corresponds with which links. Using alternative text lets you put a descriptive text on each hotspot link.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "15) Do older html files work on newer browsers?\n" +
                        "\n" +
                        "Yes, older html files are compliant to the HTML standard. Most older files work on the newer browsers, though some features may not work.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "16) Does a hyperlink apply to text only?\n" +
                        "\n" +
                        "No, hyperlinks can be used on text as well as images. That means you can convert an image into a link that will allow user to link to another page when clicked. Just surround the image within the … tag combinations.\n" +
                        "\n" +
                        "17) If the user’s operating system does not support the needed character, how can the symbol be represented?\n" +
                        "\n" +
                        "In cases wherein their operating system does not support a particular character, it is still possible to display that character by showing it as an image instead.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "18) How do you change the number type in the middle of a list?\n" +
                        "\n" +
                        "The tag includes two attributes – type and value. The type attribute can be used to change the numbering type for any list item. The value attribute can change the number index.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "19) What are style sheets?\n" +
                        "\n" +
                        "Style sheets enable you to build consistent, transportable, and well-defined style templates. These templates can be linked to several different web pages, making it easy to maintain and change the look and feel of all the web pages within a site.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "20) What bullet types are available?\n" +
                        "\n" +
                        "With ordered lists, you can select to use a number of different list types including alphabetical and Roman numerals. The type attribute for unordered lists can be set to disc, square, or circle.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "21) How do you create multicolored text in a webpage?\n" +
                        "\n" +
                        "To create text with different colors, use the … tags for every character that you want to apply a color. You can use this tag combination as many times as needed, surrounding a single character or an entire word.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "22) Why are there both numerical and named character entity values?\n" +
                        "\n" +
                        "The numerical values are taken from the ASCII values for the various characters, but these can be difficult to remember. Because of this, named character entity values were created to make it easier for web page designers to use.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "23) Write a HTML table tag sequence that outputs the following: 50 pcs 100 500 10 pcs 5 50\n" +
                        "\n" +
                        "Answer: [crayon-5460b56aaa97b118168849/]\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "24) What is the advantage of grouping several checkboxes together?\n" +
                        "\n" +
                        "Although checkboxes don’t affect one another, grouping checkboxes together helps to organize them. Checkbox buttons can have their own name and do not need to belong to a group. A single web page can have many different groups of checkboxes.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "25) What will happen if you overlap sets of tags?\n" +
                        "\n" +
                        "If two sets of html tags are overlapped, only the first tag will be recognized. You will recognize this problem when the text does not display properly on the browser screen.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "26) What are applets?\n" +
                        "\n" +
                        "Applets are small programs that can be embedded within web pages to perform some specific functionality, such as computations, animations, and information processing. Applets are written using the Java language.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "27) What if there is no text between the tags or if a text was omitted by mistake? Will it affect the display of the html file?\n" +
                        "\n" +
                        "If there is no text between the tags, then there is nothing to format, so no formatting will appear. Some tags, especially tags without a closing tag like the\n" +
                        "\n" +
                        "tag, do not require any text between them.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "28) Is it possible to set specific colors for table borders?\n" +
                        "\n" +
                        "You can specify a border color using style sheets, but the colors for a table that does not use style sheets will be the same as the text color.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "29) How do you create a link that will connect to another web page when clicked?\n" +
                        "\n" +
                        "To create hyperlinks, or links that connect to another web page, use the href tag. The general format for this is: text Replace “site” with the actual page url that is supposed to be linked to when the text is clicked.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "30) What other ways can be used to align images and wrap text?\n" +
                        "\n" +
                        "Tables can be used to position text and images. Another useful way to wrap text around an image is to use style sheets.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "31) Can a single text link point to two different web pages?\n" +
                        "\n" +
                        "No. The  tag can accept only a single href attribute, and it can point to only a single web page.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "32) What is the difference between the directory and menu lists and the unordered list?\n" +
                        "\n" +
                        "The key differences is that the directory and menu lists do not include attributes for changing the bullet style.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "33) Can you change the color of bullets?\n" +
                        "\n" +
                        "The bullet color is always the same as that of the first character in the list litem. If you surround the and the first character with a set of  tags with the color attribute set, the bullet color and the first character will be a different color from the text.\n" +
                        "\n" +
                        "34) What are the limits of the text field size?\n" +
                        "\n" +
                        "The default size for a text field is around 13 characters, but if you include the size attribute, you can set the size value to be as low as 1. The maximum size value will be determined by the browser width. If the size attribute is set to 0, the size will be set to the default size of 13 characters.\n" +
                        "\n";
                String site2 = "HTML";

                Intent intent = new Intent(v.getContext(), CSS.class);
                intent.putExtra(SITE1_KEY, site1);
                intent.putExtra(SITE2_KEY, site2);
                startActivity(intent);
            }
        });


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return true;
    }

    /**
     * Event Handling for Individual menu item selected
     * Identify single menu item by it's id
     * */
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {



        switch (item.getItemId())
        {


            case R.id.info:
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                alertDialog.setTitle("About app");
                alertDialog.setMessage("Programming IQ is an app for programmers to study interview questions of some complicated languages . \n" +
                        "\n" +
                        "Developer - Naman Tiwari\n" +
                        "Age - 12\n" +
                        "Email - namantiwari2002@gmail.com\n" +
                        "Twitter - @tweet_naman\n" +
                        "\n" +
                        "Version - 1.0 ");

                alertDialog.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
