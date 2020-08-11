import com.mojang.authlib.GameProfile;

import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.WorldSettings.GameType;

public class FakeNetworkPlayerInfo extends NetworkPlayerInfo {

	public FakeNetworkPlayerInfo(GameProfile gp) {
		super(gp);
	}

	@Override
	public IChatComponent func_178854_k() {
		return new ChatComponentText(func_178845_a().getName());
	}
	
	@Override
	public GameType getGameType() {
		return GameType.CREATIVE;
	}
	
	@Override
	public int getResponseTime() {
		return 0;
	}
	
	//slim, default
	@Override
	public String func_178851_f() {
		return "default";
	}
	
	@Override
	public ScorePlayerTeam func_178850_i() {
		return null;
	}

}
