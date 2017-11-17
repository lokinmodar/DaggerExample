package br.com.theoldpinkeye.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Just Us on 16/11/2017.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject (MainActivity target);


}
