package state;

import org.junit.jupiter.api.Test;

public class GumballMachineTest {

    @Test
    public void testGumballMachine() {
        GumballMachine machine = new GumballMachine(5);
        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
    }
}
