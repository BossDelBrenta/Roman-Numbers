# Roman Number Converter

[![Build Status](https://github.com/BossDelBrenta/Roman-Numbers/actions/workflows/ci.yml/badge.svg)](https://github.com/BossDelBrenta/Roman-Numbers/actions)
[![Coverage Status](https://coveralls.io/repos/github/BossDelBrenta/Roman-Numbers/badge.svg?branch=main)](https://coveralls.io/github/BossDelBrenta/Roman-Numbers?branch=main)

Convertitore di numeri arabi (1-1000) in numeri romani con stampa in ASCII art.

## Descrizione

Progetto sviluppato per il corso di **Metodi e Tecnologie per lo Sviluppo Software** - Universita' degli Studi di Padova.

Il programma implementa:
- **IntegerToRoman**: conversione di numeri interi (1-1000) in numeri romani
- **RomanPrinter**: stampa dei numeri romani in formato ASCII art su 6 righe

## Requisiti

- Java 11 o superiore
- Apache Maven 3.6+

## Build

```bash
mvn clean verify
```

## Test

```bash
mvn test
```

## Analisi Statica

```bash
mvn checkstyle:check
```

## Coverage Report

```bash
mvn jacoco:report
```

Il report HTML viene generato in `target/site/jacoco/index.html`.

## Autori

- **Alessandro Cisco** - 2147980
- **Enrico Biasini** - 2147948
