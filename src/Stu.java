public class Stu {
    private  int stuId;
    private  String name;
    private String cls;

    public int getStuId(int stuId) {
        return stuId;
    }

    public int setStuId(int stuId) {
        this.stuId = stuId;
        String str = String.valueOf(this.stuId);
        if (str.length()<10){
            System.out.println("您输入的学号位数不等于10位！");
            return ;
        }
        else {this.stuId =  stuId; return this.stuId;}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }
}
