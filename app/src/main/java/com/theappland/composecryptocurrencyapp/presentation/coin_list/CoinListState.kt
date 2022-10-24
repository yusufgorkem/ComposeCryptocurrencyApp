package com.theappland.composecryptocurrencyapp.presentation.coin_list

import com.theappland.composecryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
