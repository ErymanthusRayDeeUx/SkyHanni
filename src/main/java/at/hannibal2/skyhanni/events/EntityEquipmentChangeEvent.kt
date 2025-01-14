package at.hannibal2.skyhanni.events

import net.minecraft.entity.Entity
import net.minecraft.item.ItemStack

data class EntityEquipmentChangeEvent(
    val entity: Entity,
    val equipmentSlot: Int,
    val newItemStack: ItemStack?
) : LorenzEvent() {
    val isHead get() = equipmentSlot == EQUIPMENT_SLOT_HEAD

    companion object {
        const val EQUIPMENT_SLOT_HEAD = 4
        const val EQUIPMENT_SLOT_CHEST = 3
        const val EQUIPMENT_SLOT_LEGGINGS = 2
        const val EQUIPMENT_SLOT_FEET = 1
        const val EQUIPMENT_SLOT_HAND = 0
    }
}