package com.example.laptop.finalproject.contracts;

import com.example.laptop.finalproject.models.Restaurant_;


public interface FragmentsContract {

    interface IFragmentActivity{

    }

    interface IMainFragment{

        void receiveRestaurantData(Restaurant_ restaurant);
    }

    interface ITabFragment{
        void receiveRestaurantId(Restaurant_ restaurant);
    }
}