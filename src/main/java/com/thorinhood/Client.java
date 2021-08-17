package com.thorinhood;

import lombok.Builder;
import lombok.ToString;

/**
 * @author Evgeny Borisov
 */
@ToString
//@Builder // можно не писать самому, а использовать эту аннотацию, что будет проще и изящнее
public class Client {
    private final int debt; //todo you can't remove final
    private final int bonus;
    private final String name;
    private final int salary;

    public static Builder builder() {
        return new Builder();
    }

    private Client(int debt, int bonus, String name, int salary) {
        this.debt = debt;
        this.bonus = bonus;
        this.name = name;
        this.salary = salary;
    }

    public static class Builder {
        private int debt;
        private int bonus;
        private String name;
        private int salary;

        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Client build() {
            return new Client(debt, bonus, name, salary);
        }

    }

}
