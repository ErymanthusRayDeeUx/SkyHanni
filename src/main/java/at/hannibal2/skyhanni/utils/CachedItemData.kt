package at.hannibal2.skyhanni.utils

data class CachedItemData(
    /** -1 = not loaded */ var petCandies: Int? = -1,
    /** "" = not loaded */ var heldItem: String? = null,
)