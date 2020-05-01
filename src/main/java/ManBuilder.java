import java.util.ArrayList;
import java.util.Random;

public class ManBuilder {
    private Man                 man                             ;
    private Random              rnd         = new Random()      ;
    private ArrayList<Man>      ListMan     = new ArrayList<>() ;

    private String FamilyGeneration(){
        ArrayList<String> root  = new ArrayList<>();
        ArrayList<String> sub   = new ArrayList<>();
        ArrayList<String> end   = new ArrayList<>();
        end.add("ий")       ;
        end.add("ов")       ;
        end.add("ев")       ;
        end.add("ич")       ;
        root.add("сур")     ;
        root.add("жур")     ;
        root.add("дур")     ;
        root.add("бур")     ;
        root.add("кур")     ;
        root.add("верт")    ;
        root.add("мукав")   ;
        root.add("пукар")   ;
        root.add("дука")    ;
        root.add("перес")   ;
        root.add("алан")    ;
        root.add("каин")    ;
        root.add("сапог")   ;
        root.add("луг")     ;
        sub.add("Под")      ;
        sub.add("Над")      ;
        sub.add("В")        ;
        sub.add("Из")       ;
        sub.add("С")        ;
        sub.add("А")        ;
        sub.add("Око")      ;
        sub.add("Берг")     ;
        sub.add("Бес")      ;
        sub.add("Воз")      ;
        sub.add("Мус")      ;
        return ""+sub.get(rnd.nextInt(11))+""+root.get(rnd.nextInt(14))+""+end.get(rnd.nextInt(4));
    }

    private String NameGeneration(){
        ArrayList<String> Names = new ArrayList<>();
        Names.add("Иван"        );
        Names.add("Петр"        );
        Names.add("Семен"       );
        Names.add("Геннадий"    );
        Names.add("Дмитрий"     );
        Names.add("Сергей"      );
        Names.add("Михаил"      );
        Names.add("Александр"   );
        Names.add("Абрам"       );
        Names.add("Израэль"     );
        Names.add("Самуил"      );
        Names.add("Яков"        );
        Names.add("Эманнуил"    );
        Names.add("Парфирий"    );
        Names.add("Светозар"    );
        Names.add("Ильназ"      );
        return Names.get(rnd.nextInt(16));
    }

    private String FathNameGeneration(){
        ArrayList<String>   FathName    = new ArrayList<>() ;
        FathName.add("Михайлович"       );
        FathName.add("Сергеевич"        );
        FathName.add("Петрович"         );
        FathName.add("Дмитриевич"       );
        FathName.add("Семенович"        );
        FathName.add("Самуилович"       );
        FathName.add("Александрович"    );
        FathName.add("Абрамович"        );
        FathName.add("Геннадьевич"      );
        FathName.add("Иванович"         );
        FathName.add("Ильназович"       );
        FathName.add("Парфильевич"      );
        FathName.add("Яковлевич"        );
        FathName.add("Рауфович"         );
        FathName.add("Эманнуилович"     );
        return FathName.get(rnd.nextInt(15));
    }

    public String getManString(){
        man = new Man();
        man.setName(this.FamilyGeneration()+" "+this.NameGeneration()+" "+this.FathNameGeneration());
        //man.setAge(rnd.nextInt(90));
        return man.getStringNameMan();
    }
}
