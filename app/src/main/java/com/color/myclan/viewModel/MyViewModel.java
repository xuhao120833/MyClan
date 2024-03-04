package com.color.myclan.viewModel;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {


    private User user = new User("John Doe", 30);

    public User getUser() {
        return user;
    }

    public void increaseAge() {
        user.age++;
    }

    class User{
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
