public class SingletonBestApproach {
    //using volatile for best visiblity for all threads
    private static volatile SingletonBestApproach Instance;
    
    //for eager initilazation we can make object inside the ctor ans make it static
    private SingletonBestApproach(){}

    //Lazy initalization best 
    public static SingletonBestApproach getObject(){
        if(Instance == null){
            Instance = new SingletonBestApproach();
        }
        return Instance;
    }
}

class Test{
    public static void main(String[] args){
        SingletonBestApproach s1 = SingletonBestApproach.getObject();
        SingletonBestApproach s2 = SingletonBestApproach.getObject();
        System.out.println(s1 == s2);
    }
}