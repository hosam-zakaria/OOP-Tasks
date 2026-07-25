// Parant Class 
public void eat(){
    System.out.print("Iam eating ");
}
// Child Class inheritance in parant class 
@Override
public void eat(){
    super.eat();
    System.out.print("as a Boy");
}
