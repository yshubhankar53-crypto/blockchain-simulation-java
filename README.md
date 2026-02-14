# Blockchain Simulation in Java

This is a simple educational blockchain project created to explain the basic idea of blockchain technology. The project is developed using the Java programming language.  
The project shows how the use of hash linking and a basic proof of work can help protect data and its integrity.

## Features

The block structure contains timestamp, hash of the previous block, and data
SHA-256 hashing for block identity
Basic proof-of-work 
Blockchain validation logic

## How It Works

Each block stores:
Block info(data)
Timestamp
Previous block's hash
A nonce(number used once) value for proof-of-work

Blocks are linked together using hashes.  
If any block is modified, the chain breaks right away.

## What I Learned

How data is secured by cryptographic hashing
Why tampering is prevented by linking blocks
How proof-of-work raises the cost of computation
Distributed validation's significance in blockchain systems

## Disclaimer

This is a simple educational model taken from Bitcoin's architecture and does not represent the full Bitcoin protocol.
