package tech.jhavidit.cryptoapp.common

sealed class Resource<T>(val data: T? = null, val message: T? = null) {
    class Success<T>
}