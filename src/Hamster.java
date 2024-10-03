public class Hamster {

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

            private String name;
            private int ves;

        public Hamster(String name, int ves) {
                this.name = name;
                this.ves = ves;
            }

            public String getName() {  // прочитать имя
                return name; // геттер возвращает имя то что прочел

            }

            public int getVes() {
                return ves;
            }

            public void setName(String name) {  // метод принимает строковое значение нейм
                this.name = name; // устанавливает значение нейм.

            }

            public void setVes(int ves) {
                if (ves >= 0) {
                    this.ves = ves;
                } else {
                    System.out.println("Возраст отрицательный");
                }
            }

            void jump() {
                System.out.println("Киса прыгает");
            }
        }






    class Homa1 {
        public static void main (String [] args){
            Hamster hamster1 = new Hamster("Хома", 4);

            hamster1.getName(); // выводим гетнейм


            System.out.println(hamster1.getName());


            //cat1.name = "Сара"; // открытый доступ по внутренним полям
            //cat1.age = -7;// открытый доступ по внутренним полям  используется модификатор private
            //hamster1.setAge(5);
            hamster1.jump();
            System.out.println(hamster1.getVes());
            System.out.println(hamster1.getName());
            //System.out.println(cat1.setName();); сеттер вывыести на печать нельзя потому что метод войд






        }


}
