import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//对照组
class StudentBad {
    String name;
    int age;

    public StudentBad(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "(" + age + ")";
    }
}

// 实验组：重写 equals + hashCode
class StudentGood {
    String name;
    int age;

    public StudentGood(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 判断"内容是不是相同"：类型是 StudentGood，且 name 相同，且 age 相同
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof StudentGood)) return false;
        StudentGood other = (StudentGood) o;
        return this.name.equals(other.name) && this.age == other.age;
    }

    // 按参与比较的字段算一个数出来
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return name + "(" + age + ")";
    }
}

public class EqualsHashCodeDemo {

    public static void main(String[] args) {
        Set<StudentBad> stu1 = new HashSet<>();
        stu1.add(new StudentBad("张三", 20));
        stu1.add(new StudentBad("张三", 20));
        System.out.println(stu1.toString());
        
        Set<StudentGood> stu2 = new HashSet<>();
        stu2.add(new StudentGood("张三", 20));
        stu2.add(new StudentGood("张三", 20));
        System.out.println(stu2.toString());

    }
}
