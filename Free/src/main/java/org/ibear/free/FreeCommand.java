package org.ibear.free;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class FreeCommand extends Command implements Listener {

    public static Inventory player_inv, vip1_inv, vip2_inv, vip3_inv, vip4_inv;
    public ChatColor CC;

    protected FreeCommand() {
        super("free");
    }


    @Override
    public boolean execute(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) {
            return true;
        }
        Player player = (Player) commandSender;
            Player_Show_Inv(player);
        return true;
    }

    public void Player_Show_Inv(Player player) {
        player_inv = Bukkit.getServer().createInventory(null, 9, "Free for Player and above");

        ItemStack food = new ItemStack(Material.APPLE);
        ItemStack weapon = new ItemStack(Material.STONE_AXE);
        ItemStack armor = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemStack next = new ItemStack(Material.LIME_STAINED_GLASS_PANE);

        ItemMeta food_meta = food.getItemMeta();
        ItemMeta weapon_meta = weapon.getItemMeta();
        ItemMeta armor_meta = armor.getItemMeta();
        ItemMeta close_meta = close.getItemMeta();
        ItemMeta next_meta = next.getItemMeta();


        food_meta.setDisplayName("Food Set");
        weapon_meta.setDisplayName("Weapon Set");
        armor_meta.setDisplayName("Armor Set");
        close_meta.setDisplayName(CC.RED + "Close");
        next_meta.setDisplayName(CC.GREEN + "Next");

        food_meta.setLore(Arrays.asList(
                CC.WHITE + "- Apple x16",
                CC.WHITE + "- Bread x16 ",
                CC.YELLOW + "- Cooldown: 24 Hours."
        ));
        weapon_meta.setLore(Arrays.asList(
                CC.WHITE + "- Stone Axe x1",
                CC.WHITE + "- Stone Pickage x1",
                CC.WHITE + "- Stone Shovel x1",
                CC.WHITE + "- Stone Hoe x1",
                CC.WHITE + "- Stone Sword x1",
                CC.YELLOW + "- Cooldown: 24 Hours."
        ));
        armor_meta.setLore(Arrays.asList(
                CC.WHITE + "- Leather Helmet x1",
                CC.WHITE + "- Leather Chestplate x1",
                CC.WHITE + "- Leather Leggings x1",
                CC.WHITE + "- Leather Boots x1",
                CC.YELLOW + "- Cooldown: 24 Hours."
        ));

        weapon.setItemMeta(weapon_meta);
        food.setItemMeta(food_meta);
        armor.setItemMeta(armor_meta);
        close.setItemMeta(close_meta);
        next.setItemMeta(next_meta);

        player_inv.setItem(8, next);
        player_inv.setItem(7, close);
        player_inv.setItem(2, armor);
        player_inv.setItem(1, weapon);
        player_inv.setItem(0, food);
        player.openInventory(player_inv);
    }

    public void VIP1_Show_Inv(Player player) {
        Inventory vip1_inv = Bukkit.getServer().createInventory(null, 9, "Free for VIP1 and above");

        ItemStack golden_apple = new ItemStack(Material.GOLDEN_APPLE);
        ItemStack chainmail_chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemStack iron_axe = new ItemStack(Material.IRON_AXE);
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemStack next = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemStack back = new ItemStack(Material.RED_STAINED_GLASS_PANE);

        ItemMeta meta_golden_apple = golden_apple.getItemMeta();
        ItemMeta meta_chainmail_chestplate = chainmail_chestplate.getItemMeta();
        ItemMeta meta_iron_axe = iron_axe.getItemMeta();
        ItemMeta meta_close = close.getItemMeta();
        ItemMeta meta_next = next.getItemMeta();
        ItemMeta meta_back = back.getItemMeta();

        meta_golden_apple.setDisplayName("VIP1 Food Set");
        meta_iron_axe.setDisplayName("VIP1 Weapons Set");
        meta_chainmail_chestplate.setDisplayName("VIP1 Armors");
        meta_close.setDisplayName(CC.RED + "Close");
        meta_next.setDisplayName(CC.GREEN + "Next");
        meta_back.setDisplayName(CC.AQUA + "Back");

        meta_golden_apple.setLore(Arrays.asList(
                CC.WHITE + "Golden Apple x1",
                CC.WHITE + "Bread x32",
                CC.YELLOW + "Cooldown: 24 Hours."
        ));
        meta_iron_axe.setLore(Arrays.asList(
                CC.WHITE + "Iron Axe x1",
                CC.WHITE + "Iron Pickage x1",
                CC.WHITE + "Stone Shovel x2",
                CC.WHITE + "Hoe Shovel x2",
                CC.WHITE + "Stone Sword x2",
                CC.YELLOW + "Cooldown: 24 Hours."
        ));
        meta_chainmail_chestplate.setLore(Arrays.asList(
                CC.WHITE + "Chainmail Helmet x1",
                CC.WHITE + "Chainmail Chestplate x1",
                CC.WHITE + "Chainmail Leggings x1",
                CC.WHITE + "Chainmail Boots x1",
                CC.YELLOW + "Cooldown: 24 Hours."
        ));

        golden_apple.setItemMeta(meta_golden_apple);
        iron_axe.setItemMeta(meta_iron_axe);
        chainmail_chestplate.setItemMeta(meta_chainmail_chestplate);
        close.setItemMeta(meta_close);
        next.setItemMeta(meta_next);
        back.setItemMeta(meta_back);

        vip1_inv.setItem(0, golden_apple);
        vip1_inv.setItem(1, iron_axe);
        vip1_inv.setItem(2, chainmail_chestplate);
        vip1_inv.setItem(7, close);
        vip1_inv.setItem(8, next);
        vip1_inv.setItem(6, back);

        player.openInventory(vip1_inv);
    }
    public void VIP2_Show_Inv(Player player) {
        Inventory vip2_inv = Bukkit.getServer().createInventory(null, 9, "Free for VIP2 and above");

        ItemStack golden_apple = new ItemStack(Material.GOLDEN_APPLE);
        ItemStack iron_chestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemStack iron_axe = new ItemStack(Material.IRON_AXE);
        ItemStack iron_ore = new ItemStack(Material.IRON_ORE);
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemStack next = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemStack back = new ItemStack(Material.RED_STAINED_GLASS_PANE);

        ItemMeta meta_golden_apple = golden_apple.getItemMeta();
        ItemMeta meta_iron_chestplate = iron_chestplate.getItemMeta();
        ItemMeta meta_iron_axe = iron_axe.getItemMeta();
        ItemMeta meta_iron_ore = iron_ore.getItemMeta();
        ItemMeta meta_close = close.getItemMeta();
        ItemMeta meta_next = next.getItemMeta();
        ItemMeta meta_back = back.getItemMeta();

        meta_golden_apple.setDisplayName("VIP2 Food Set");
        meta_iron_axe.setDisplayName("VIP2 Weapons Set");
        meta_iron_chestplate.setDisplayName("VIP2 Armors");
        meta_iron_ore.setDisplayName("VIP2 Ore");
        meta_close.setDisplayName(CC.RED + "Close");
        meta_next.setDisplayName(CC.GREEN + "Next");
        meta_back.setDisplayName(CC.AQUA + "Back");

        meta_golden_apple.setLore(Arrays.asList(
                CC.WHITE + "Golden Apple x2",
                CC.WHITE + "Bread x32",
                CC.YELLOW + "Cooldown: 24 Hours."
        ));
        meta_iron_axe.setLore(Arrays.asList(
                CC.WHITE + "Iron Axe x1",
                CC.WHITE + "Iron Pickage x1",
                CC.WHITE + "Iron Shovel x1",
                CC.WHITE + "Iron Shovel x1",
                CC.WHITE + "Iron Sword x1",
                CC.YELLOW + "Cooldown: 24 Hours."
        ));
        meta_iron_chestplate.setLore(Arrays.asList(
                CC.WHITE + "Iron Helmet x1",
                CC.WHITE + "Iron Chestplate x1",
                CC.WHITE + "Chainmail Leggings x1",
                CC.WHITE + "Chainmail Boots x1",
                CC.YELLOW + "Cooldown: 24 Hours."
        ));
        meta_iron_ore.setLore(Arrays.asList(
                CC.WHITE + "Iron Ore x3"
        ));

        golden_apple.setItemMeta(meta_golden_apple);
        iron_axe.setItemMeta(meta_iron_axe);
        iron_chestplate.setItemMeta(meta_iron_chestplate);
        iron_ore.setItemMeta(meta_iron_ore);
        close.setItemMeta(meta_close);
        next.setItemMeta(meta_next);
        back.setItemMeta(meta_back);

        vip2_inv.setItem(0, golden_apple);
        vip2_inv.setItem(1, iron_axe);
        vip2_inv.setItem(2, iron_chestplate);
        vip2_inv.setItem(3, iron_ore);
        vip2_inv.setItem(7, close);
        vip2_inv.setItem(8, next);
        vip2_inv.setItem(6, back);

        player.openInventory(vip2_inv);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(player_inv)) {
            PlayerInventoryClick(event);
        }
        if (!event.getInventory().equals(vip1_inv)) {
            VIP1InventoryClick(event);
        }
        if (event.getInventory().equals(vip2_inv)){
            VIP2InventoryClick(event);
        }
    }

    @EventHandler
    public void PlayerInventoryClick(InventoryClickEvent event) {
        event.setCancelled(true);
        ItemStack clickedItem = event.getCurrentItem();
        Player player = (Player) event.getWhoClicked();

        if (clickedItem == null || clickedItem.getType() == Material.AIR) return;
        switch (clickedItem.getType()) {
            case APPLE -> {
                ItemStack apple = new ItemStack(Material.APPLE, 16);
                ItemStack bread = new ItemStack(Material.BREAD, 16);
                player.getInventory().addItem(apple, bread);
                player.sendMessage("Received Food Set!");
            }
            case STONE_AXE -> {
                ItemStack stone_axe = new ItemStack(Material.STONE_AXE);
                ItemStack stone_pickage = new ItemStack(Material.STONE_PICKAXE);
                ItemStack stone_shovel = new ItemStack(Material.STONE_SHOVEL);
                ItemStack stone_hoe = new ItemStack(Material.STONE_HOE);
                ItemStack stone_sword = new ItemStack(Material.STONE_SWORD);

                player.getInventory().addItem(stone_axe, stone_pickage, stone_shovel, stone_hoe, stone_sword);
                player.sendMessage("Received Weapon Set!");
            }
            case LEATHER_CHESTPLATE -> {
                ItemStack leather_helmet = new ItemStack(Material.LEATHER_HELMET);
                ItemStack leather_chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
                ItemStack leather_leggings = new ItemStack(Material.LEATHER_LEGGINGS);
                ItemStack leather_boots = new ItemStack(Material.LEATHER_BOOTS);

                player.getInventory().addItem(leather_helmet, leather_chestplate, leather_leggings, leather_boots);
                player.sendMessage("Received Armor Set!");
            }
            case BARRIER -> {
                player.closeInventory();
            }
            case LIME_STAINED_GLASS_PANE -> {
                if (!player.hasPermission("free.vip1") || player.isOp()) {
                    VIP1_Show_Inv(player);
                } else {
                    player.sendMessage(CC.RED + "You do not have permission");
                    player.sendMessage(CC.RED + "For VIP1 ranks and above.");
                }
            }
        }
    }
    @EventHandler
    public void VIP1InventoryClick(InventoryClickEvent event) {
        event.setCancelled(true);
        Player player = (Player) event.getWhoClicked();
        ItemStack clickedItem = event.getCurrentItem();

        if (clickedItem == null || clickedItem.getType() == Material.AIR) return;
        switch (clickedItem.getType()) {
            case GOLDEN_APPLE -> {
                ItemStack golden_apple = new ItemStack(Material.GOLDEN_APPLE, 1);
                ItemStack bread = new ItemStack(Material.BREAD, 32);
                player.getInventory().addItem(golden_apple, bread);
                player.sendMessage("Received Food Set");
            }
            case IRON_AXE -> {
                ItemStack iron_axe = new ItemStack(Material.IRON_AXE, 1);
                ItemStack iron_pickage = new ItemStack(Material.IRON_PICKAXE, 1);
                ItemStack stone_shovel = new ItemStack(Material.STONE_SHOVEL, 2);
                ItemStack stone_hoe = new ItemStack(Material.STONE_HOE, 2);
                ItemStack stone_sword = new ItemStack(Material.STONE_SWORD, 2);
                player.getInventory().addItem(iron_axe, iron_pickage, stone_shovel, stone_hoe, stone_sword);
                player.sendMessage("Received Weapons Set");
            }
            case CHAINMAIL_CHESTPLATE -> {
                ItemStack chainmail_helmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
                ItemStack chainmail_chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
                ItemStack chainmail_leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
                ItemStack chainmail_boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
                player.getInventory().addItem(chainmail_helmet, chainmail_chestplate, chainmail_leggings, chainmail_boots);
                player.sendMessage("Received Armors Set");
            }
            case BARRIER -> {
                player.closeInventory();
            }
            case RED_STAINED_GLASS_PANE -> {
                Player_Show_Inv(player);
            }
            case LIME_STAINED_GLASS_PANE -> {
                if (!player.hasPermission("free.vip2") || player.isOp()){
                    VIP2_Show_Inv(player);
                } else {
                    player.sendMessage(CC.RED + "You do not have permission");
                    player.sendMessage(CC.RED + "For VIP2 ranks and above.");
                }
            }
        }
    }
    @EventHandler
    public void VIP2InventoryClick(InventoryClickEvent event) {
        event.setCancelled(true);
        Player player = (Player) event.getWhoClicked();
        ItemStack clickedItem = event.getCurrentItem();

        if (clickedItem == null || clickedItem.getType() == Material.AIR) return;
        switch (clickedItem.getType()) {
            case GOLDEN_APPLE -> {
                ItemStack golden_apple = new ItemStack(Material.GOLDEN_APPLE, 2);
                ItemStack bread = new ItemStack(Material.BREAD, 32);
                player.getInventory().addItem(golden_apple, bread);
                player.sendMessage("Received Food Set");
            }
            case IRON_AXE -> {
                ItemStack iron_axe = new ItemStack(Material.IRON_AXE, 1);
                ItemStack iron_pickage = new ItemStack(Material.IRON_PICKAXE, 1);
                ItemStack iron_shovel = new ItemStack(Material.IRON_SHOVEL, 1);
                ItemStack iron_hoe = new ItemStack(Material.IRON_HOE, 1);
                ItemStack iron_sword = new ItemStack(Material.IRON_SWORD, 1);
                player.getInventory().addItem(iron_axe, iron_pickage, iron_shovel, iron_hoe, iron_sword);
                player.sendMessage("Received Weapons Set");
            }
            case IRON_CHESTPLATE -> {
                ItemStack iron_helmet = new ItemStack(Material.IRON_HELMET, 1);
                ItemStack iron_chestplate = new ItemStack(Material.IRON_CHESTPLATE, 1);
                ItemStack chainmail_leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
                ItemStack chainmail_boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
                player.getInventory().addItem(iron_helmet, iron_chestplate, chainmail_leggings, chainmail_boots);
                player.sendMessage("Received Armors Set");
            }
            case IRON_ORE -> {
                ItemStack iron_ore = new ItemStack(Material.IRON_ORE, 3);
                player.sendMessage("Received Ore Set");
            }
            case BARRIER -> {
                player.closeInventory();
            }
            case RED_STAINED_GLASS_PANE -> {
                Player_Show_Inv(player);
            }
            case LIME_STAINED_GLASS_PANE -> {
                if (!player.hasPermission("free.vip3") || player.isOp()){
                    //VIP3_Show_Inv(player);
                    player.closeInventory();
                } else {
                    player.sendMessage(CC.RED + "You do not have permission");
                    player.sendMessage(CC.RED + "For VIP3 ranks and above.");
                }
            }
        }
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event) {
        if (event.getInventory().equals(player_inv)
                || event.getInventory().equals(vip1_inv)
                || event.getInventory().equals(vip2_inv)){
            event.setCancelled(true);
        }
    }
}