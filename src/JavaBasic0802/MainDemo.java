package JavaBasic0802;

/*
   mian:方法的格式讲解：
       public static void main（String[] args）{...}

       public:公共的，访问权限是最大的。由于main方法是被jvm调用，所以权限要够大。
       static:静态的，不需要创建对象通过类名就可以，方便jvm调用。
       void:因为我们曾经说过，方法的返回值是返回给调用者，而main方法
            是被jvm调用。你返回内容给jvm没有意义。
       main:是一个常见的方法入口。我见过的语言都是以main作为入口。
       String[] args:这是一个字符串数组。值去哪里了？
*/
public class MainDemo {
    public static void main(String[] args){
        System.out.println(args);//[Ljava.lang.String;@135fbaa4
        System.out.println(args.length);//0
        //那么
        System.out.println(args[0]);//ArrayIndexOutOfBoundsException
    }
}
