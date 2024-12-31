package org.ibear.free;

import net.kyori.adventure.text.Component;
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
import java.util.Set;

public class FreeCommand extends Command implements Listener {

    public static Inventory inv;
    public ChatColor CC;

    protected FreeCommand() {
        super("free");
    }

    private ItemStack createItem(Material material, String name, String... lore){
        ItemStack item = new ItemStack(material);
        ItemMeta meta_item = item.getItemMeta();
        if (name != null) {
            meta_item.setDisplayName(name);
        }
        if (lore != null && lore.length > 0) {
            meta_item.setLore(Arrays.asList(lore));
        }
        item.setItemMeta(meta_item);
        return item;
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
        inv = Bukkit.getServer().createInventory(null, 9, "Free for Player and above");

        inv.setItem(0, createItem(Material.APPLE, "Food Set",
                CC.WHITE + "- Apple x16",
                CC.WHITE + "- Bread x16 ",
                CC.YELLOW + "- Cooldown: 24 Hours."
        ));
        inv.setItem(1, createItem(Material.STONE_AXE, "Weapons Set",
                CC.WHITE + "- Stone Axe x1",
                CC.WHITE + "- Stone Pickage x1",
                CC.WHITE + "- Stone Shovel x1",
                CC.WHITE + "- Stone Hoe x1",
                CC.WHITE + "- Stone Sword x1",
                CC.YELLOW + "- Cooldown: 24 Hours."
        ));
        inv.setItem(2, createItem(Material.LEATHER_CHESTPLATE, "Armors Set",
                CC.WHITE + "- Leather Helmet x1",
                CC.WHITE + "- Leather Chestplate x1",
                CC.WHITE + "- Leather Leggings x1",
                CC.WHITE + "- Leather Boots x1",
                CC.YELLOW + "- Cooldown: 24 Hours."
        ));
        inv.setItem(4,createItem(Material.PAPER, "Player Card",
                CC.WHITE + "Card อาวุธเทพ x1",
                CC.WHITE + "Card ชุดเทพ x1",
                CC.WHITE + "Card สัตว์เทพ x1",
                CC.YELLOW + "Cooldown: 48 Hours."));
        inv.setItem(7, createItem(Material.BLUE_STAINED_GLASS_PANE, "Close", null));
        inv.setItem(8, createItem(Material.LIME_STAINED_GLASS_PANE, "Next", null));
        player.openInventory(inv);
    }

    public void VIP1_Show_Inv(Player player) {
        inv = Bukkit.getServer().createInventory(null, 9, "Free for VIP1 and above");

        inv.setItem(0, createItem(Material.GOLDEN_APPLE, "VIP1 Food Set",
                CC.WHITE + "Golden Apple x1",
                CC.WHITE + "Bread x32",
                CC.YELLOW + "Cooldown: 24 Hours."
        ));
        inv.setItem(1, createItem(Material.IRON_AXE, "VIP1 Weapons Set",
                CC.WHITE + "Iron Axe x1",
                CC.WHITE + "Iron Pickage x1",
                CC.WHITE + "Stone Shovel x2",
                CC.WHITE + "Hoe Shovel x2",
                CC.WHITE + "Stone Sword x2",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(2, createItem(Material.CHAINMAIL_CHESTPLATE, "VIP1 Armors Set",
                CC.WHITE + "Chainmail Helmet x1",
                CC.WHITE + "Chainmail Chestplate x1",
                CC.WHITE + "Chainmail Leggings x1",
                CC.WHITE + "Chainmail Boots x1",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(4,createItem(Material.PAPER, "VIP1 Card",
                CC.WHITE + "Card อาวุธเทพ x2",
                CC.WHITE + "Card ชุดเทพ x2",
                CC.WHITE + "Card สัตว์เทพ x2",
                CC.YELLOW + "Cooldown: 48 Hours."));
        inv.setItem(6, createItem(Material.RED_STAINED_GLASS_PANE, "Previous"));
        inv.setItem(7, createItem(Material.BLUE_STAINED_GLASS_PANE, "Close"));
        inv.setItem(8, createItem(Material.LIME_STAINED_GLASS_PANE, "Next"));
        player.openInventory(inv);
    }
    public void VIP2_Show_Inv(Player player) {
        inv = Bukkit.getServer().createInventory(null, 9, "Free for VIP2 and above");

        inv.setItem(0,createItem(Material.GOLDEN_APPLE, "VIP2 Food Set",
                CC.WHITE + "Golden Apple x2",
                CC.WHITE + "Bread x32",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(1,createItem(Material.IRON_AXE, "VIP2 Weapons Set",
                CC.WHITE + "Iron Axe x1",
                CC.WHITE + "Iron Pickage x1",
                CC.WHITE + "Iron Shovel x1",
                CC.WHITE + "Iron Shovel x1",
                CC.WHITE + "Iron Sword x1",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(2,createItem(Material.IRON_CHESTPLATE, "VIP2 Armors Set",
                CC.WHITE + "Iron Helmet x1",
                CC.WHITE + "Iron Chestplate x1",
                CC.WHITE + "Chainmail Leggings x1",
                CC.WHITE + "Chainmail Boots x1",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(3,createItem(Material.IRON_ORE, "VIP2 Ore",
                CC.WHITE + "Iron Ore x3",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(4,createItem(Material.PAPER, "VIP2 Card",
                CC.WHITE + "Card อาวุธเทพ x2",
                CC.WHITE + "Card ชุดเทพ x2",
                CC.WHITE + "Card สัตว์เทพ x2",
                CC.YELLOW + "Cooldown: 48 Hours."));
        inv.setItem(6, createItem(Material.RED_STAINED_GLASS_PANE, "Previous"));
        inv.setItem(7, createItem(Material.BLUE_STAINED_GLASS_PANE, "Close"));
        inv.setItem(8, createItem(Material.LIME_STAINED_GLASS_PANE, "Next"));
        player.openInventory(inv);
    }
    public void VIP3_Show_Inv(Player player) {
        inv = Bukkit.getServer().createInventory(null, 9, "Free for VIP3 and above");

        inv.setItem(0,createItem(Material.ENCHANTED_GOLDEN_APPLE, "VIP3 Food Set",
                CC.WHITE + "Enchanted Golden Apple x1",
                CC.WHITE + "Golden Apple x2",
                CC.WHITE + "Bread x32",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(1,createItem(Material.IRON_AXE, "VIP3 Weapons Set",
                CC.WHITE + "Iron Axe x2",
                CC.WHITE + "Iron Pickage x2",
                CC.WHITE + "Iron Shovel x1",
                CC.WHITE + "Iron Shovel x1",
                CC.WHITE + "Iron Sword x1",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(2,createItem(Material.IRON_CHESTPLATE, "VIP3 Armors Set",
                CC.WHITE + "Iron Helmet x1",
                CC.WHITE + "Iron Chestplate x1",
                CC.WHITE + "Iron Leggings x1",
                CC.WHITE + "Iron Boots x1",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(3,createItem(Material.GOLD_ORE, "VIP3 Ore",
                CC.WHITE + "Iron Ore x3",
                CC.WHITE + "Gold Ore x3",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(4,createItem(Material.PAPER, "VIP3 Card",
                CC.WHITE + "Card อาวุธเทพ x2",
                CC.WHITE + "Card ชุดเทพ x2",
                CC.WHITE + "Card สัตว์เทพ x2",
                CC.YELLOW + "Cooldown: 48 Hours."));
        inv.setItem(6, createItem(Material.RED_STAINED_GLASS_PANE, "Previous"));
        inv.setItem(7, createItem(Material.BLUE_STAINED_GLASS_PANE, "Close"));
        inv.setItem(8, createItem(Material.LIME_STAINED_GLASS_PANE, "Next"));
        player.openInventory(inv);
    }
    public void VIP4_Show_Inv(Player player) {
        inv = Bukkit.getServer().createInventory(null, 9, "Free for VIP4");

        inv.setItem(0,createItem(Material.ENCHANTED_GOLDEN_APPLE, "VIP4 Food Set",
                CC.WHITE + "Enchanted Golden Apple x2",
                CC.WHITE + "Golden Apple x2",
                CC.WHITE + "Bread x32",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(1,createItem(Material.DIAMOND_AXE, "VIP4 Weapons Set",
                CC.WHITE + "Diamond Axe x2",
                CC.WHITE + "Diamond Pickage x1",
                CC.WHITE + "Iron Shovel x1",
                CC.WHITE + "Iron Shovel x1",
                CC.WHITE + "Iron Sword x1",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(2,createItem(Material.DIAMOND_CHESTPLATE, "VIP4 Armors Set",
                CC.WHITE + "Diamond Helmet x1",
                CC.WHITE + "Diamond Chestplate x1",
                CC.WHITE + "Iron Leggings x1",
                CC.WHITE + "Iron Boots x1",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(3,createItem(Material.DIAMOND_ORE, "VIP4 Ore",
                CC.WHITE + "Iron Ore x3",
                CC.WHITE + "Gold Ore x3",
                CC.WHITE + "Diamond Ore x1",
                CC.YELLOW + "Cooldown: 24 Hours."));
        inv.setItem(4,createItem(Material.PAPER, "VIP4 Card",
                CC.WHITE + "Card อาวุธเทพ x3",
                CC.WHITE + "Card ชุดเทพ x3",
                CC.WHITE + "Card สัตว์เทพ x3",
                CC.YELLOW + "Cooldown: 48 Hours."));
        inv.setItem(6, createItem(Material.RED_STAINED_GLASS_PANE, "Previous"));
        inv.setItem(7, createItem(Material.BLUE_STAINED_GLASS_PANE, "Close"));
        player.openInventory(inv);
    }
    @EventHandler
    public void ClickAction(InventoryClickEvent event) {
        Player player = (Player)  event.getWhoClicked();
        ItemStack current = event.getCurrentItem();
        String pageTitle = event.getView().getTitle();
        if (current == null || current.getType() == Material.AIR) return;
        switch (pageTitle) {
            case "Free for Player and above":
                event.setCancelled(true);
                if (current.getType() == Material.APPLE) {
                    ItemStack apple = new ItemStack(Material.APPLE, 16);
                    ItemStack bread = new ItemStack(Material.BREAD, 16);

                    player.getInventory().addItem(apple, bread);
                    player.sendMessage("Received Food Set!");
                } else if (current.getType() == Material.STONE_AXE) {
                    ItemStack stone_axe = new ItemStack(Material.STONE_AXE);
                    ItemStack stone_pickage = new ItemStack(Material.STONE_PICKAXE);
                    ItemStack stone_shovel = new ItemStack(Material.STONE_SHOVEL);
                    ItemStack stone_hoe = new ItemStack(Material.STONE_HOE);
                    ItemStack stone_sword = new ItemStack(Material.STONE_SWORD);

                    player.getInventory().addItem(stone_axe, stone_pickage, stone_shovel, stone_hoe, stone_sword);
                    player.sendMessage("Received Weapons Set!");
                } else if (current.getType() == Material.LEATHER_CHESTPLATE) {

                    ItemStack leather_helmet = new ItemStack(Material.LEATHER_HELMET);
                    ItemStack leather_chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
                    ItemStack leather_leggings = new ItemStack(Material.LEATHER_LEGGINGS);
                    ItemStack leather_boots = new ItemStack(Material.LEATHER_BOOTS);

                    player.getInventory().addItem(leather_helmet, leather_chestplate, leather_leggings, leather_boots);
                    player.sendMessage("Received Armors Set!");
                } else if (current.getType() == Material.PAPER) {
                    ItemStack card_weapon = new ItemStack(Material.PAPER,1);
                    ItemStack card_armor = new ItemStack(Material.PAPER,1);
                    ItemStack card_animal = new ItemStack(Material.PAPER,1);

                    ItemMeta card_weapon_meta = card_weapon.getItemMeta();
                    ItemMeta card_armor_meta = card_armor.getItemMeta();
                    ItemMeta card_animal_meta = card_animal.getItemMeta();

                    card_weapon_meta.setDisplayName("Card Lwn Weapon");
                    card_armor_meta.setDisplayName("Card Lwn Armor");
                    card_animal_meta.setDisplayName("Card Lwn Animal");

                    card_weapon.setItemMeta(card_weapon_meta);
                    card_armor.setItemMeta(card_armor_meta);
                    card_animal.setItemMeta(card_animal_meta);

                    player.getInventory().addItem(card_weapon, card_armor, card_animal);
                    player.sendMessage("Received Player Card!");
                } else if (current.getType() == Material.BLUE_STAINED_GLASS_PANE) {
                    player.closeInventory();
                } else if (current.getType() == Material.LIME_STAINED_GLASS_PANE) {
                    VIP1_Show_Inv(player);
                }
                break;
            case "Free for VIP1 and above":
                event.setCancelled(true);
                if (!player.hasPermission("free.vip1") || player.isOp()) {
                    if (current.getType() == Material.GOLDEN_APPLE) {
                        ItemStack golden_apple = new ItemStack(Material.GOLDEN_APPLE);
                        ItemStack bread = new ItemStack(Material.BREAD, 16);

                        player.getInventory().addItem(golden_apple, bread);
                        player.sendMessage("Received VIP1 Food Set!");
                    } else if (current.getType() == Material.IRON_AXE) {
                        ItemStack iron_axe = new ItemStack(Material.IRON_AXE, 1);
                        ItemStack iron_pickage = new ItemStack(Material.IRON_PICKAXE, 1);
                        ItemStack stone_shovel = new ItemStack(Material.STONE_SHOVEL, 2);
                        ItemStack stone_hoe = new ItemStack(Material.STONE_HOE, 2);
                        ItemStack stone_sword = new ItemStack(Material.STONE_SWORD, 2);

                        player.getInventory().addItem(iron_axe, iron_pickage, stone_shovel, stone_hoe, stone_sword);
                        player.sendMessage("Received VIP1 Weapons Set!");
                    } else if (current.getType() == Material.CHAINMAIL_CHESTPLATE) {
                        ItemStack chainmail_helmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
                        ItemStack chainmail_chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
                        ItemStack chainmail_leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
                        ItemStack chainmail_boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);

                        player.getInventory().addItem(chainmail_helmet, chainmail_chestplate, chainmail_leggings, chainmail_boots);
                        player.sendMessage("Received VIP1 Armors Set!");
                    } else if (current.getType() == Material.PAPER) {
                        ItemStack card_weapon = new ItemStack(Material.PAPER,2);
                        ItemStack card_armor = new ItemStack(Material.PAPER,2);
                        ItemStack card_animal = new ItemStack(Material.PAPER,2);

                        ItemMeta card_weapon_meta = card_weapon.getItemMeta();
                        ItemMeta card_armor_meta = card_armor.getItemMeta();
                        ItemMeta card_animal_meta = card_animal.getItemMeta();

                        card_weapon_meta.setDisplayName("Card Lwn Weapon");
                        card_armor_meta.setDisplayName("Card Lwn Armor");
                        card_animal_meta.setDisplayName("Card Lwn Animal");

                        card_weapon.setItemMeta(card_weapon_meta);
                        card_armor.setItemMeta(card_armor_meta);
                        card_animal.setItemMeta(card_animal_meta);

                        player.getInventory().addItem(card_weapon, card_armor, card_animal);
                        player.sendMessage("Received VIP1 Card!");
                    } else if (current.getType() == Material.RED_STAINED_GLASS_PANE) {
                        Player_Show_Inv(player);
                    } else if (current.getType() == Material.BLUE_STAINED_GLASS_PANE) {
                        player.closeInventory();
                    } else if (current.getType() == Material.LIME_STAINED_GLASS_PANE) {
                        VIP2_Show_Inv(player);
                    }
                    break;
                } else {
                    player.sendMessage(CC.RED + "You do not have permission");
                    player.sendMessage(CC.RED + "For VIP1 ranks and above.");
                }
                break;
            case "Free for VIP2 and above":
                event.setCancelled(true);
                if (!player.hasPermission("free.vip2") || player.isOp()) {
                    if (current.getType() == Material.GOLDEN_APPLE) {
                        ItemStack golden_apple = new ItemStack(Material.GOLDEN_APPLE, 2);
                        ItemStack bread = new ItemStack(Material.BREAD, 32);

                        player.getInventory().addItem(golden_apple, bread);
                        player.sendMessage("Received VIP2 Food Set!");
                    } else if (current.getType() == Material.IRON_AXE) {
                        ItemStack iron_axe = new ItemStack(Material.IRON_AXE, 1);
                        ItemStack iron_pickage = new ItemStack(Material.IRON_PICKAXE, 1);
                        ItemStack iron_shovel = new ItemStack(Material.IRON_SHOVEL, 1);
                        ItemStack iron_hoe = new ItemStack(Material.IRON_HOE, 1);
                        ItemStack iron_sword = new ItemStack(Material.IRON_SWORD, 1);

                        player.getInventory().addItem(iron_axe, iron_pickage, iron_shovel, iron_hoe, iron_sword);
                        player.sendMessage("Received VIP2 Weapons Set!");
                    } else if (current.getType() == Material.IRON_CHESTPLATE) {
                        ItemStack iron_helmet = new ItemStack(Material.IRON_HELMET, 1);
                        ItemStack iron_chestplate = new ItemStack(Material.IRON_CHESTPLATE, 1);
                        ItemStack chainmail_leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
                        ItemStack chainmail_boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);

                        player.getInventory().addItem(iron_helmet, iron_chestplate, chainmail_leggings, chainmail_boots);
                        player.sendMessage("Received VIP2 Armors Set!");
                    } else if (current.getType() == Material.IRON_ORE) {
                        ItemStack iron_ore = new ItemStack(Material.IRON_ORE, 3);

                        player.getInventory().addItem(iron_ore);
                        player.sendMessage("Received VIP2 Ore!");
                    } else if (current.getType() == Material.PAPER) {
                        ItemStack card_weapon = new ItemStack(Material.PAPER,2);
                        ItemStack card_armor = new ItemStack(Material.PAPER,2);
                        ItemStack card_animal = new ItemStack(Material.PAPER,2);

                        ItemMeta card_weapon_meta = card_weapon.getItemMeta();
                        ItemMeta card_armor_meta = card_armor.getItemMeta();
                        ItemMeta card_animal_meta = card_animal.getItemMeta();

                        card_weapon_meta.setDisplayName("Card Lwn Weapon");
                        card_armor_meta.setDisplayName("Card Lwn Armor");
                        card_animal_meta.setDisplayName("Card Lwn Animal");

                        card_weapon.setItemMeta(card_weapon_meta);
                        card_armor.setItemMeta(card_armor_meta);
                        card_animal.setItemMeta(card_animal_meta);

                        player.getInventory().addItem(card_weapon, card_armor, card_animal);
                        player.sendMessage("Received VIP2 Card!");
                    } else if (current.getType() == Material.RED_STAINED_GLASS_PANE) {
                        VIP1_Show_Inv(player);
                    } else if (current.getType() == Material.BLUE_STAINED_GLASS_PANE) {
                        player.closeInventory();
                    } else if (current.getType() == Material.LIME_STAINED_GLASS_PANE) {
                        VIP3_Show_Inv(player);
                    }
                break;
                } else {
                    player.sendMessage(CC.RED + "You do not have permission");
                    player.sendMessage(CC.RED + "For VIP2 ranks and above.");
                }
                break;
            case "Free for VIP3 and above":
                event.setCancelled(true);
                if (!player.hasPermission("free.vip3") || player.isOp()) {
                    if (current.getType() == Material.ENCHANTED_GOLDEN_APPLE) {
                        ItemStack enchanted_golden_apple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
                        ItemStack golden_apple = new ItemStack(Material.GOLDEN_APPLE, 2);
                        ItemStack bread = new ItemStack(Material.BREAD, 32);

                        player.getInventory().addItem(enchanted_golden_apple, golden_apple, bread);
                        player.sendMessage("Received VIP3 Food Set!");
                    } else if (current.getType() == Material.IRON_AXE) {
                        ItemStack iron_axe = new ItemStack(Material.IRON_AXE, 2);
                        ItemStack iron_pickage = new ItemStack(Material.IRON_PICKAXE, 2);
                        ItemStack iron_shovel = new ItemStack(Material.IRON_SHOVEL, 1);
                        ItemStack iron_hoe = new ItemStack(Material.IRON_HOE, 1);
                        ItemStack iron_sword = new ItemStack(Material.IRON_SWORD, 1);

                        player.getInventory().addItem(iron_axe, iron_pickage, iron_shovel, iron_hoe, iron_sword);
                        player.sendMessage("Received VIP3 Weapons Set!");
                    } else if (current.getType() == Material.IRON_CHESTPLATE) {
                        ItemStack iron_helmet = new ItemStack(Material.IRON_HELMET, 1);
                        ItemStack iron_chestplate = new ItemStack(Material.IRON_CHESTPLATE, 1);
                        ItemStack iron_leggings = new ItemStack(Material.IRON_LEGGINGS, 1);
                        ItemStack iron_boots = new ItemStack(Material.IRON_BOOTS, 1);

                        player.getInventory().addItem(iron_helmet, iron_chestplate, iron_leggings, iron_boots);
                        player.sendMessage("Received VIP3 Armors Set!");
                    } else if (current.getType() == Material.GOLD_ORE) {
                        ItemStack iron_ore = new ItemStack(Material.IRON_ORE, 3);
                        ItemStack gold_ore = new ItemStack(Material.GOLD_ORE, 3);

                        player.getInventory().addItem(iron_ore, gold_ore);
                        player.sendMessage("Received VIP3 Ore!");
                    } else if (current.getType() == Material.PAPER) {
                        ItemStack card_weapon = new ItemStack(Material.PAPER,2);
                        ItemStack card_armor = new ItemStack(Material.PAPER,2);
                        ItemStack card_animal = new ItemStack(Material.PAPER,2);

                        ItemMeta card_weapon_meta = card_weapon.getItemMeta();
                        ItemMeta card_armor_meta = card_armor.getItemMeta();
                        ItemMeta card_animal_meta = card_animal.getItemMeta();

                        card_weapon_meta.setDisplayName("Card Lwn Weapon");
                        card_armor_meta.setDisplayName("Card Lwn Armor");
                        card_animal_meta.setDisplayName("Card Lwn Animal");

                        card_weapon.setItemMeta(card_weapon_meta);
                        card_armor.setItemMeta(card_armor_meta);
                        card_animal.setItemMeta(card_animal_meta);

                        player.getInventory().addItem(card_weapon, card_armor, card_animal);
                        player.sendMessage("Received VIP3 Card!");
                    } else if (current.getType() == Material.RED_STAINED_GLASS_PANE) {
                        VIP2_Show_Inv(player);
                    } else if (current.getType() == Material.BLUE_STAINED_GLASS_PANE) {
                        player.closeInventory();
                    } else if (current.getType() == Material.LIME_STAINED_GLASS_PANE) {
                        VIP4_Show_Inv(player);
                    }
                    break;
                } else {
                    player.sendMessage(CC.RED + "You do not have permission");
                    player.sendMessage(CC.RED + "For VIP3 ranks and above.");
                }
                break;
            case "Free for VIP4":
                event.setCancelled(true);
                if (!player.hasPermission("free.vip4") || player.isOp()) {
                    if (current.getType() == Material.ENCHANTED_GOLDEN_APPLE) {
                        ItemStack enchanted_golden_apple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 2);
                        ItemStack golden_apple = new ItemStack(Material.GOLDEN_APPLE, 2);
                        ItemStack bread = new ItemStack(Material.BREAD, 32);

                        player.getInventory().addItem(enchanted_golden_apple, golden_apple, bread);
                        player.sendMessage("Received VIP4 Food Set!");
                    } else if (current.getType() == Material.DIAMOND_AXE) {
                        ItemStack diamond_axe = new ItemStack(Material.DIAMOND_AXE, 1);
                        ItemStack diamond_pickage = new ItemStack(Material.DIAMOND_PICKAXE, 1);
                        ItemStack iron_shovel = new ItemStack(Material.IRON_SHOVEL, 1);
                        ItemStack iron_hoe = new ItemStack(Material.IRON_HOE, 1);
                        ItemStack iron_sword = new ItemStack(Material.IRON_SWORD, 1);

                        player.getInventory().addItem(diamond_axe, diamond_pickage, iron_shovel, iron_hoe, iron_sword);
                        player.sendMessage("Received VIP4 Weapons Set!");
                    } else if (current.getType() == Material.DIAMOND_CHESTPLATE) {
                        ItemStack diamond_helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
                        ItemStack diamond_chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
                        ItemStack iron_leggings = new ItemStack(Material.IRON_LEGGINGS, 1);
                        ItemStack iron_boots = new ItemStack(Material.IRON_BOOTS, 1);

                        player.getInventory().addItem(diamond_helmet, diamond_chestplate, iron_leggings, iron_boots);
                        player.sendMessage("Received VIP4 Armors Set!");
                    } else if (current.getType() == Material.DIAMOND_ORE) {
                        ItemStack iron_ore = new ItemStack(Material.IRON_ORE, 3);
                        ItemStack gold_ore = new ItemStack(Material.GOLD_ORE, 3);
                        ItemStack diamond_ore = new ItemStack(Material.DIAMOND_ORE, 1);

                        player.getInventory().addItem(iron_ore, gold_ore, diamond_ore);
                        player.sendMessage("Received VIP4 Ore!");
                    } else if (current.getType() == Material.PAPER) {
                        ItemStack card_weapon = new ItemStack(Material.PAPER,3);
                        ItemStack card_armor = new ItemStack(Material.PAPER,3);
                        ItemStack card_animal = new ItemStack(Material.PAPER,3);

                        ItemMeta card_weapon_meta = card_weapon.getItemMeta();
                        ItemMeta card_armor_meta = card_armor.getItemMeta();
                        ItemMeta card_animal_meta = card_animal.getItemMeta();

                        card_weapon_meta.setDisplayName("Card Lwn Weapon");
                        card_armor_meta.setDisplayName("Card Lwn Armor");
                        card_animal_meta.setDisplayName("Card Lwn Animal");

                        card_weapon.setItemMeta(card_weapon_meta);
                        card_armor.setItemMeta(card_armor_meta);
                        card_animal.setItemMeta(card_animal_meta);

                        player.getInventory().addItem(card_weapon, card_armor, card_animal);
                        player.sendMessage("Received VIP4 Card!");
                    } else if (current.getType() == Material.RED_STAINED_GLASS_PANE) {
                        VIP3_Show_Inv(player);
                    } else if (current.getType() == Material.BLUE_STAINED_GLASS_PANE) {
                        player.closeInventory();
                    }
                    break;
                } else {
                    player.sendMessage(CC.RED + "You do not have permission");
                    player.sendMessage(CC.RED + "For VIP4");
                }
                break;
            default:
        }
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event) {
        Component title = event.getView().title();
        if (title.equals("Free for Player and above")
                || title.equals("Free for VIP1 and above")
                || title.equals("Free for VIP2 and above")
                || title.equals("Free for VIP3 and above")
                || title.equals("Free for VIP4")){
            event.setCancelled(true);
        }
    }
}