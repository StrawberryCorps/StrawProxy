package bzh.strawberrycorps.proxy;

import bzh.strawberrycorps.proxy.listener.PingListener;
import net.md_5.bungee.api.plugin.Plugin;

public class StrawProxy extends Plugin {

    public static StrawProxy STRAW;

    @Override
    public void onEnable() {
        STRAW = this;
        long begin = System.currentTimeMillis();
        getLogger().info("######################## [StrawProxy - " + getDescription().getVersion() + "] #################################");

        getProxy().getPluginManager().registerListener(this, new PingListener());

        getLogger().info("Plugin enabled in "+(System.currentTimeMillis() - begin)+" ms.");
        getLogger().info("######################## [StrawAuth - " + getDescription().getVersion() + "] #################################");
    }

    @Override
    public void onDisable() {

    }
}