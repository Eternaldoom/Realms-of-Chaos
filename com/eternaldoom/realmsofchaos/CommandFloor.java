package com.eternaldoom.realmsofchaos;

import net.minecraft.block.Block;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.world.World;

public class CommandFloor extends CommandBase{

	@Override
	public String getCommandName() {
		return "floor";
	}
	
	@Override
	public int getRequiredPermissionLevel(){
		return 2;
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/floor <lengthX> <lengthY> <block>";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		int i = sender.getPlayerCoordinates().posX;
		int j = sender.getPlayerCoordinates().posY;
		int k = sender.getPlayerCoordinates().posZ;
		int length = parseIntBounded(sender, args[0], -50, 50);
		int width = parseIntBounded(sender, args[1], -50, 50);
		int meta = 0;
		if(args.length >= 4) meta = parseIntBounded(sender, args[3], 0, 15);
		Block block = CommandBase.getBlockByText(sender, args[2]);
		World world = sender.getEntityWorld();
		
		if (!world.blockExists(i, j, k))
        {
            throw new CommandException("Cannot set blocks out of the world", new Object[0]);
        }else{
        	if(i+length >= i){
        		for(int l = i; l < i+length; l++){
        			if(k+width >= k){
        				for(int w = k; w < k+width; w++){
        					world.setBlock(l, j, w, block, meta, 2);
        				}
        			}else if(k+width < k){
        				for(int w = k; w > k+width; w--){
        					world.setBlock(l, j, w, block, meta, 2);
        				}
        			}
        		}
        	}else if(i+length < i){
        		for(int l = i; l > i+length; l--){
        			if(k+width >= k){
        				for(int w = k; w < k+width; w++){
        					world.setBlock(l, j, w, block, meta, 2);
        				}
        			}else if(k+width < k){
        				for(int w = k; w > k+width; w--){
        					world.setBlock(l, j, w, block, meta, 2);
        				}
        			}
        		}
        	}
        }
	}

}
