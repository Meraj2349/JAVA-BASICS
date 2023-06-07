package Genatic;

public class Gen <t> {

    private t data;

    public Gen(t data) {
        this.data = data;
    }

    public t getData() {
        return data;
    }

    public void setData(t data) {
        this.data = data;
    }

    //! extend shape
    //data <shape>
}
