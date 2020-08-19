public class quadratic {
    private double a;
    private double b;
    private double c;
    
    
    
    // Constructors
    quadratic(){
    this.a=0;
    this.b=0;
    this.c=0;
    }
    quadratic(double aa , double bb, double cc){
    this.a=aa;
    this.b=bb;
    this.c=cc;
    }

    // getters
    public double getA(){
    return this.a;
    }
    public double getB(){
    return this.b;
    }
    public double getC(){
    return this.c;
    }
    
    //  setters
    public void setA(double newX){
    this.a=newX;
    }
    public void setB(double newY){
    this.b=newY;
    }
    public void setC(double newZ){
    this.c=newZ;
    }
    public double discriminant() {
    return this.b*this.b-4*this.a*this.c;
    }
    
    public double axisofsymmetry() {
    return (this.zeros1()+this.zeros2())/2;
    }
    public double vertex() {
    return (this.a*(this.axisofsymmetry()*this.axisofsymmetry())+this.b*this.axisofsymmetry()+this.c);
    }
    
    public double zeros1() {
    return (-b+Math.sqrt(this.discriminant()))/(2*this.a);
    }
    public double zeros2() {
    return (-b-Math.sqrt(this.discriminant()))/(2*this.a);
    }
    public void solveEq() {
    double p=this.discriminant();
    
    if(p>0) {
    System.out.println("2 solution");
    System.out.println("The first x-intercept is "+this.zeros1());
    System.out.println("The second x-intercept is "+this.zeros2());
    System.out.println("This is the factored form "+"y=a(x-"+this.zeros1()+")(x-"+ this.zeros2()+")");
    System.out.println("Axis of symmetry is "+ this.axisofsymmetry());
    System.out.println("The vertex is ("+ this.axisofsymmetry()+","+this.vertex()+")");
    
    }
    else if(p==0) {
    System.out.println("1 solution");
    System.out.println(this.zeros1());
    System.out.println("y= a ( x - "+this.zeros1()+")(x -"+ this.zeros2()+")");
    }else {
    System.out.println("0 solution");
    
    }
    }
    }