# Java快速入门

三个不同版本的区别:
- Java SE (Standard Edition)
- Java EE (Enterprise Edition)
- Java ME (Micro Edition)

编译和运行:
- 编译: javac main.java -> main.class
- 运行: java main.java 或者 java main 

数据类型:
- 基本数据类型: 整数类型(byte,short,int,long)、浮点类型(float,double)、字符类型(char)、布尔类型(boolean)
- 引用数据类型: 除了基本数据类型以外的都是引用类型，最常用的有(String)


this变量:
- this 是一个隐藏变量，他始终指向当前的实例

public 和 private:
- public:外部可访问
- private:内部方法才可以调用(防止外部随意更改内部数据造成混乱)

参数、可变参数:
- 参数： 必须一一对应，类型和数量都需要保证相同
- 可变参数：相当于数组类型 符号是`(String... names)`

参数绑定：
- 基本类型传参，是调用方值的复制，修改不会相互影响
- 引用类型传参，是地址的复制，修改一个会影响另一个

构造方法：
- 比较特殊
- 名称是类的名字
- 没有返回值、也没有void
- 参数没有限制
- 必须使用`new`关键字

默认构造方法：
- 所有类都有构造函数
- 没有明确写出的会自动添加

多个构造方法：
- 根据参数个数、位置、类型自动区分使用哪个构造









