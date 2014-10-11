package com.eternaldoom.realmsofchaos.asm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import net.minecraft.item.Item;

import com.google.common.collect.Lists;

public class ModelNames {
	
	public static HashMap<Item, ArrayList<String>> variantNames = new HashMap();
	
	public static void addVariantName(Item item, String... names)
	{
		if (variantNames.containsKey(item)) variantNames.get(item).addAll(Arrays.asList(names));
		else variantNames.put(item, Lists.newArrayList(names));
	}

}