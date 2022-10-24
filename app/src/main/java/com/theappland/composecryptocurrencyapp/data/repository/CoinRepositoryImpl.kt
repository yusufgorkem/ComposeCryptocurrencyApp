package com.theappland.composecryptocurrencyapp.data.repository

import com.theappland.composecryptocurrencyapp.data.remote.CoinPaprikaApi
import com.theappland.composecryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.theappland.composecryptocurrencyapp.data.remote.dto.CoinDto
import com.theappland.composecryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}