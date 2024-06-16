package lesson8.object;

public class Man {
    private String eyesColour;
    private int dnaCode;

    public Man(String eyesColour, int dnaCode) {
        this.eyesColour = eyesColour;
        this.dnaCode = dnaCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Man man = (Man) o;
      return dnaCode == man.dnaCode;
    }
}
