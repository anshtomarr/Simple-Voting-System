# Simple Java Voting System

This is a simple console-based voting application written in Java. It allows users to cast votes after validating their age and authenticating via an admin password.

## 📌 Features

- Age validation (must be 18+ to vote)
- Admin password verification (3 attempts allowed)
- Voting for 4 different candidates
- Vote count summary
- Winner announcement

## 🧾 How It Works

1. User is prompted to enter their name and age.
2. If eligible (age ≥ 18), they are asked to enter an admin password.
3. After successful login:
   - User casts a vote by selecting from 4 candidates.
   - Votes are recorded.
4. After voting, the system:
   - Displays the number of votes each candidate received.
   - Announces the winner.

## 🔐 Default Admin Password
