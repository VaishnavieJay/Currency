package com.natwest.currency.configuration;

import com.natwest.currency.data.WalletStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.util.Arrays;

@Configuration
public class ApplicationConfig {

    @Autowired
    private WalletStore walletStore;

    @EventListener(ApplicationReadyEvent.class)
    public void loadWallet() {
        walletStore.setCurrencyNotesList(Arrays.asList(1, 50, 5, 5, 10, 1, 20, 20, 20, 5, 1, 50));
    }

}
