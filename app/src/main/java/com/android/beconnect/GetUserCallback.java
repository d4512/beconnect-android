package com.android.beconnect;

/**
 * Created by pritamkarmakar on 6/23/15.
 */
interface GetUserCallback {

    /**
     * Invoked when background task is completed
     */

    public abstract void done(User returnedUser);
}