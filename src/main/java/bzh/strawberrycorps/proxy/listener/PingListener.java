package bzh.strawberrycorps.proxy.listener;

import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PingListener implements Listener {

    @EventHandler
    public void onPing(ProxyPingEvent event) {
        ServerPing serverPing = event.getResponse();
        serverPing.setPlayers(new ServerPing.Players(250, serverPing.getPlayers().getOnline(), null));
        String l1 = "§9» §bStrawBerry §9« §3■ §9» §3[1.19] §9«";
        String l2 = "§9■ §bGros mangeur de fruits rouges §9■";
        serverPing.setDescription(centerMotd(48+7, l1) + "\n" + centerMotd(48,l2));
        event.setResponse(serverPing);

    }

    private String centerMotd(int maxLength, String secondMotd) {
        StringBuilder builder = new StringBuilder(secondMotd);
        char space = ' ';
        int distance = (maxLength - secondMotd.length());
        for (int i = 0; i < distance; ++i)
            builder.insert(0, space);
        return builder.toString();
    }
}