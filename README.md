﻿ JavaHomeWork7
类的继承和多态
===============
任务与整体解决方案：
------
* 请为管理学校中教师的工作证和学生的学生证设计一个类体系结构，尽可能保证代码的重用率。假设工作证包括*编号、姓名、性别、出生年月*、职务和签发工作证日期；学生证包括*编号、姓名、性别、出生年月*、系别、入校日期及每学年的注册信息。
* 设计一个人员类（Person），其中包含一个方法pay，代表人员的工资支出。再从Person类派生出教师类（Teacher）和大学生类（CollegeStudent）其中<br>教师：工资支出=基本工资+授课时数*30<br>大学生：奖学金支出<br>将人员类定义为抽象类，pay为抽象方法，设计程序实现多态性。
* 将第2题中的pay定义在接口中，设计程序实现多态性。

### 请为管理学校中教师的工作证和学生的学生证设计一个类体系结构，尽可能保证代码的重用率。假设工作证包括编号、姓名、性别、出生年月、职务和签发工作证日期；学生证包括编号、姓名、性别、出生年月、系别、入校日期及每学年的注册信息。

较为简单，定义超类License，内含参数编号、姓名、性别、出生年月，并含有print()函数用来输出。用SLicense和TLicens继承License类，各自定义构造方法，使用主类验证即可。

### 设计一个人员类（Person），其中包含一个方法pay，代表人员的工资支出。再从Person类派生出教师类（Teacher）和大学生类（CollegeStudent）其中<br>
	教师：工资支出=基本工资+授课时数*30<br>
	大学生：奖学金支出<br>
将人员类定义为抽象类，pay为抽象方法，设计程序实现多态性。

抽象类的理解较为困难。定义等非常容易，但是在理解“为什么要使用抽象类、抽象类能做什么”中花了很多功夫。其余的还是较为简单的。这次再次使用了read这种有意思的赋值方法，巩固了一下，感觉还不赖。

### 将第2题中的pay定义在接口中，设计程序实现多态性。

接口的理解也比较困难。接口是做什么的？为什么要定义接口？这是个比较难以理解的概念。代码使用netbeans->重构->提取接口之后抄一下就行了，问题倒是不大

领悟：
------
### 抽象：何谓抽象？何谓抽象类/方法？
[菜鸟教程](http://www.runoob.com/java/java-abstraction.html)中的解释是：** 如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。 **但是为什么要使用抽象类？还是不太清楚<br>在网上寻找一段时间后我比较赞同[CSDN小祥V5](https://blog.csdn.net/x2145637/article/details/50115453)的观点：一般类的确可以完成全部抽象类需要的应用，但是有些方法真的没必要使用抽象类一个一个写。如果各个子类之中的方法都不尽相同，那就不需要在父类之中再写一个方法。说白了就是没必要。<br>还有一个就是，父类使用抽象类，对自己写子类的时候有个提示作用。要是抽象类中定义的方法没有在子类中实现，编译就会报错。如果父类是个一般类，编译就会通过，自己发现不了自己的错误，后期回来找很麻烦。
### 接口：何为借口？接口又是来干啥的？
[菜鸟教程](http://http://www.runoob.com/java/java-interfaces.html)中的解释是：**接口是抽象方法的集合**这个解释之前没看懂，但后来就有些头绪了。接口里面只有也只能有抽象方法，就是里面只有一堆方法名。不像抽象类，抽象类可以有方法的实现，接口不行。<br>
接口是Java实现多继承的唯一方式
### 抽象类、接口的实现
abstract为抽象关键词。使用abstract修饰类即可实现抽象。具体使用方法是：
```Java
[可见度] abstract class [类名]{
//例：
public abstract class Employee{
```
接口的声明使用的关键词是interface。
```Java
[可见度] interface 接口名称 [extends 其他的接口名名] {
//例：
public interface NameOfInterface
```
接口和接口中的方法都是隐式抽象的，当声明接口的时候，不需要abstract关键字。接口中只能有public方法。<br>
接口在实现时使用
```Java
[可见度]class [类名] implements [接口名]{
//例：
public class MammalInt implements Animal{
```
### 抽象类与接口的区别
抽象类跟接口还是挺相似的。以下是[转载自jessenpan的总结](http://www.importnew.com/12399.html)，<br>原文链接： javacodegeeks 翻译： ImportNew.com - jessenpan译文链接： http://www.importnew.com/12399.html<br>

| 参数 | 抽象类 | 接口 |
| - | :-: | :-: |
| 默认的方法实现 | 它可以有默认的方法实现 | 接口完全是抽象的。它根本不存在方法的实现 |
| 实现 | 子类使用extends关键字来继承抽象类。如果子类不是抽象类的话，它需要提供抽象类中所有声明的方法的实现。| 子类使用关键字implements来实现接口。它需要提供接口中所有声明的方法的实现 |
| 构造器 | 抽象类可以有构造器 | 接口不能有构造器 |
| 与正常Java类的区别 | 除了你不能实例化抽象类之外，它和普通Java类没有任何区别 | 接口是完全不同的类型 |
| 访问修饰符 | 抽象方法可以有public、protected和default这些修饰符 | 接口方法默认修饰符是public。你不可以使用其它修饰符。 |
| main方法 | 抽象方法可以有main方法并且我们可以运行它 | 接口没有main方法，因此我们不能运行它。 |
| 多继承 | 抽象方法可以继承一个类和实现多个接口 | 接口只可以继承一个或多个其它接口 |
| 速度 | 它比接口速度要快 | 接口是稍微有点慢的，因为它需要时间去寻找在类中实现的方法。 |
| 添加新方法 | 如果你往抽象类中添加新的方法，你可以给它提供默认的实现。因此你不需要改变你现在的代码。 | 如果你往接口中添加方法，那么你必须改变实现该接口的类。 |

<br>*Signed-off-by: 遥梦幽兰kzx <kjx336@163.com>*