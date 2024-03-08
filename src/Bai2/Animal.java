package Bai2;

public class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Move() {
    }


    public void Say() {
    }


    @Override
    public String toString() {
        return "Animal(" +
                "name " + name +
                ", age )" + age ;
    }

     static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void Say() {
            System.out.println("Sủa: Gâu Gâu");
        }

        @Override
        public void Move() {
            System.out.println("Chạy");
        }

         static class Cat extends Animal {
            public Cat(String name, int age) {
                super(name, age);
            }

            @Override
            public void Say() {
                System.out.println("Kêu: meo meo");
            }

            @Override
            public void Move() {
                System.out.println("Nhảy");
            }

            static class Bird extends Animal {
                public Bird(String name, int age) {
                    super(name, age);
                }

                @Override
                public void Say() {
                    System.out.println("Hót");
                }

                @Override
                public void Move() {
                    System.out.println("Bay");
                }
            }
        }
    }
}
