package state;

public interface State {

    /*
        投入25美分
     */
    void insertQuarter();

    /*
        退出25美分
     */
    void ejectQuarter();

    /*
        轉動旋鈕
     */
    void turnCrank();

    /*
        分配糖果
     */
    void dispense();
}
